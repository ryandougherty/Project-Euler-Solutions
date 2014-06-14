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
public class Problem16 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem16().run());
    }
    private int n = 1000;
    
    @Override
    public String run() {
        String result = BigInteger.ONE.shiftLeft(n).toString();
        int sum = 0;
        for (int i = 0; i < result.length(); i++) {
            sum += (result.charAt(i) - '0');
        }
        return String.valueOf(sum);
    }
    
}
