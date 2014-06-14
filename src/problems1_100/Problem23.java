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
public class Problem23 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem23().run());
    }

    private static final int LIMIT = 28123;

    private final boolean[] isAbundant = new boolean[LIMIT + 1];

    @Override
    public String run() {
        for (int i = 1; i < isAbundant.length; i++) {
            isAbundant[i] = isAbundant(i);
        }

        int sum = 0;
        for (int i = 1; i <= LIMIT; i++) {
            if (!isSumOf2Abundants(i)) {
                sum += i;
            }
        }
        return Integer.toString(sum);
    }

    private boolean isSumOf2Abundants(int n) {
        for (int i = 0; i <= n; i++) {
            if (isAbundant[i] && isAbundant[n - i]) {
                return true;
            }
        }
        return false;
    }

    private static boolean isAbundant(int n) {
        int sum = 1;
        int end = (int) Math.sqrt(n);
        for (int i = 2; i <= end; i++) {
            if (n % i == 0) {
                sum += i + n / i;
            }
        }
        if (end * end == n) {
            sum -= end;
        }
        return sum > n;
    }

}
