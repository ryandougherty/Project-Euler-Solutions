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
public class Problem36 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem36().run());
    }

    private final int min = 1, max = 1000000;
    
    @Override
    public String run() {
        long sum = 0L;
        for (int i = min; i <= max; i++) {
            if (isPalindrome10(i) && isPalindrome2(i)) {
                sum += i;
            }
        }
        return String.valueOf(sum);
    }

    private boolean isPalindrome10(int i) {
        String s = String.valueOf(i);
        return s.equals(new StringBuilder(s).reverse().toString());
    }

    private boolean isPalindrome2(int i) {
        String s = Integer.toBinaryString(i);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
}
