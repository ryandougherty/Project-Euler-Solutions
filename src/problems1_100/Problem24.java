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
public class Problem24 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem24().run());
    }
    
    private final int n = 1000000;
    
    @Override
    public String run() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        for (int i = 0; i < n-1; i++) {
            if (!nextPermutation(array)) {
            }
        }

        String ans = "";
        for (int i = 0; i < array.length; i++) {
            ans += array[i];
        }
        return ans;
    }

    private boolean nextPermutation(int[] array) {
        int i, n = array.length;
        for (i = n - 2;; i--) {
            if (i < 0) {
                return false;
            }
            if (array[i] < array[i + 1]) {
                break;
            }
        }
        for (int j = 1; i + j < n - j; j++) {
            int tp = array[i + j];
            array[i + j] = array[n - j];
            array[n - j] = tp;
        }
        int j;
        for (j = i + 1; array[j] <= array[i]; j++);
        int tp = array[i];
        array[i] = array[j];
        array[j] = tp;
        return true;
    }
}
