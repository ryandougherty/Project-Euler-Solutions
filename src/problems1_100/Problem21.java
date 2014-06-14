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
public class Problem21 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem21().run());
    }
    
    private int n = 10000;
    
    @Override
    public String run() {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (isAmicable(i)) {
                sum += i;
            }
        }
        return String.valueOf(sum);
    }

    private static boolean isAmicable(int n) {
        int m = divisorSum(n);
        return m != n && divisorSum(m) == n;
    }

    private static int divisorSum(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

}
