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
public class Problem04 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem04().run());
    }
    
    @Override
    public String run() {
        int min = 100;
        int max = 999;
        int result = 0;
        for (int i = min; i<=max; i++) {
            for (int j = min; j<=max; j++) {
                if (isPalindrome(i*j)) {
                    if (i*j > result) {
                        result = i*j;
                    }
                }
            }
        }
        return String.valueOf(result);
    }

    private boolean isPalindrome(int i) {
        String s = String.valueOf(i);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    
}
