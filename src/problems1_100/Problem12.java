/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems1_100;

import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author Ryan
 */
public class Problem12 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem12().run());
    }
    
    @Override
    public String run() {
        int n = 0;
        for (long i = 1; ;i++) {
            n += i;
            if (countDivisors(n) > 500) {
                return String.valueOf(n);
            }
        }
    }

    private int countDivisors(long i) {
        int sqrt = (int) Math.sqrt(i);
        int count = 0;
        for (int j = 1; j < sqrt; j++) {
            if (i % j == 0) {
                count += 2;
            }
        }
        if (sqrt * sqrt == i) {
            count++;
        }
        return count;
    }
    
}
