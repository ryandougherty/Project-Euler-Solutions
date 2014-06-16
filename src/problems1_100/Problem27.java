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
public class Problem27 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem27().run());
    }
    
    private final int min = -999;
    private final int max = 999;
    
    @Override
    public String run() {
        int maxCount = 0;
        int result = 0;
        for (int a = min; a <= maxCount; a++) {
            for (int b = min; b <= maxCount; b++) {
                int count = countPrimes(a, b);
                if (count > maxCount) {
                    maxCount = count;
                    result = a*b;
                }
            }
        }
        return String.valueOf(result);
    }

    private int countPrimes(int a, int b) {
        int n = 0;
        while (isPrime(n*n + a*n + b)) {
            n++;
        }
        return n;
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
