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
public class Problem3 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem3().run());
    }

    @Override
    public String run() {
        long n = 600851475143L;
        while (true) {
            long p = smallestFactor(n);
            if (p < n) {
                n /= p;
            } else {
                return Long.toString(n);
            }
        }
    }

    private static long smallestFactor(long n) {
        for (long i = 2, end = (long) Math.sqrt(n); i <= end; i++) {
            if (n % i == 0) {
                return i;
            }
        }
        return n;  // Prime
    }

}
