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
public class Problem20 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem20().run());
    }
    
    private final int n = 100;
    
    @Override
    public String run() {
        String result = factorial(n).toString();
        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            sum += (result.charAt(i) - '0');
        }
        return String.valueOf(sum);
    }

    private BigInteger factorial(int n) {
        if (n <= 1) return BigInteger.ONE;
        BigInteger result = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
    
}
