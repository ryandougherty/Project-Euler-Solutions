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
public class Problem15 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem15().run());
    }

    private final int n = 20;

    // the result is (2n choose n)
    @Override
    public String run() {
        return binomial(2 * n, n).toString();
    }

    private BigInteger binomial(int n, int k) {
        return factorial(n).divide(factorial(n - k).multiply(factorial(k)));
    }

    private BigInteger factorial(int n) {
        BigInteger prod = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            prod = prod.multiply(BigInteger.valueOf(i));
        }
        return prod;
    }
}
