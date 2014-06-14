/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems1_100;

import java.math.BigInteger;
import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author Ryan
 */
public class Problem14 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem14().run());
    }

    private static final int LIMIT = 1000000;
    private static final BigInteger CACHE_SIZE = BigInteger.valueOf(LIMIT);

    @Override
    public String run() {
        int maxArg = -1;
        int maxChain = 0;
        for (int i = 1; i < LIMIT; i++) {
            int chainLen = collatzChainLength(BigInteger.valueOf(i));
            if (chainLen > maxChain) {
                maxArg = i;
                maxChain = chainLen;
            }
        }
        return Integer.toString(maxArg);
    }
    
    private final int[] collatzChainLength = new int[CACHE_SIZE.intValue()];

    private int collatzChainLength(BigInteger n) {
        if (n.compareTo(CACHE_SIZE) >= 0) {
            return collatzChainLengthDirect(n);
        }

        int index = n.intValue();
        if (collatzChainLength[index] == 0) {
            collatzChainLength[index] = collatzChainLengthDirect(n);
        }
        return collatzChainLength[index];
    }

    private int collatzChainLengthDirect(BigInteger n) {
        if (n.equals(BigInteger.ONE)) {
            return 1;
        } else if (!n.testBit(0)) {
            return collatzChainLength(n.shiftRight(1)) + 1;
        } else {
            return collatzChainLength(n.multiply(BigInteger.valueOf(3)).add(BigInteger.ONE)) + 1;
        }
    }

}
