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
public class Problem07 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem07().run());
    }
    
    @Override
    public String run() {
        int count = 0;
        for (int i = 2; ;i++) {
            if (isPrime(i)) {
                count++;
                if (count == 10001) {
                    return String.valueOf(i);
                }
            }
        }
    }

    private boolean isPrime(int i) {
        int sqrt = (int) Math.floor(Math.sqrt(i));
        for (int j = 2; j<=sqrt; j++) {
            if (i%j == 0) {
                return false;
            }
        }
        return true;
    }
}
