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
public class Problem39 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem39().run());
    }
    
    private final int min = 1;
    private final int maxPossible = 998;
    private int[] array = new int[3000];
    
    @Override
    public String run() {
        for (int a = min; a <= maxPossible; a++) {
            for (int b = min; b <= maxPossible; b++) {
                for (int c = min; c <= maxPossible; c++) {
                    if (a + b + c <= 1000) {
                        if (a*a + b*b == c*c) {
                            array[a+b+c]++;
                        }
                    }
                }
            }
        }
        int max = 0;
        int result = 0;
        int i = 0;
        for (int c : array) {
            if (c > max) {
                max = c;
                result = i;
            }
            i++;
        }
        return String.valueOf(result);
    }
    
}
