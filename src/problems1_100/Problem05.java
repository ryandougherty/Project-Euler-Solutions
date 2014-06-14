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
 * @author redoughe
 */
public class Problem05 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem05().run());
    }

    @Override
    public String run() {
        BigInteger lcm = BigInteger.ONE;
        int min = 1, max = 20;
        for (int i = min; i <= max; i++) {
            lcm = calculateLCM(BigInteger.valueOf(i), lcm);
        }
        return lcm.toString();
    }

    private static BigInteger calculateLCM(BigInteger x, BigInteger y) {
        return x.divide(x.gcd(y)).multiply(y);
    }
}
