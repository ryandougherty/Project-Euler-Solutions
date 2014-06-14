/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems1_100;

import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author redoughe
 */
public class Problem02 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem02().run());
    }
    
    @Override
    public String run() {
        int i1 = 1;
        int i2 = 1;
        int fibo = 1;
        long sum = 0;
        for (int i = 3; fibo <= 4000000; i++) {
            
            fibo = i1 + i2;
            if (fibo % 2 == 0) {
                sum += fibo;
            }
            i1 = i2;
            i2 = fibo;
        }
        return String.valueOf(sum);
    }
    
}
