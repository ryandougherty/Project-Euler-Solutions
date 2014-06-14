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
public class Problem25 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem25().run());
    }

    private final int DIGITS = 1000;
    
    @Override
    public String run() {
        BigInteger lowerthres = BigInteger.TEN.pow(DIGITS - 1);
        BigInteger upperthres = BigInteger.TEN.pow(DIGITS);
        BigInteger prev = BigInteger.ONE;
        BigInteger cur = BigInteger.ZERO;
        int i = 0;
        while (true) {
            // At this point, prev = fibonacci(i - 1) and cur = fibonacci(i)
            if (cur.compareTo(lowerthres) >= 0) {
                return Integer.toString(i);
            } else if (cur.compareTo(upperthres) >= 0) {
                throw new RuntimeException("Not found");
            }

            BigInteger temp = cur.add(prev);
            prev = cur;
            cur = temp;
            i++;
        }
    }
}
