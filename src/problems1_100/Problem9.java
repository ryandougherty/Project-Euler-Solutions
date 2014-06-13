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
public class Problem9 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem9().run());
    }
    
    @Override
    public String run() {
        int min = 1;
        int max = 1000;
        for (int a = min; a <= 1000; a++) {
            for (int b = min; b <= 1000; b++) {
                for (int c = min; c <= 1000; c++) {
                    if (a*a + b*b == c*c) {
                        if (a + b + c == 1000) {
                            return String.valueOf(a*b*c);
                        }
                    }
                }
            }
        }
        return null;
    }
    
}
