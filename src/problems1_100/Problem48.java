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
public class Problem48 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem48().run());
    }
    
    private final int n = 1000;
    private final BigInteger mod = BigInteger.TEN.pow(10);
    
    @Override
    public String run() {
        BigInteger sum = BigInteger.valueOf(0);
        for (int i = 1; i <= n; i++) {
            sum = sum.add(BigInteger.valueOf(i).pow(i));
        }
        return sum.mod(mod).toString();
    }
    
}
