/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems1_100;

import java.math.BigInteger;
import java.util.HashSet;
import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author redoughe
 */
public class Problem29 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem29().run());
    }
    
    private final HashSet<BigInteger> array = new HashSet<>();
    private final int min = 2, max = 100;
    
    @Override
    public String run() {
        for (int a = min; a <= max; a++) {
            for (int b = min; b <= max; b++) {
                BigInteger pow = new BigInteger(String.valueOf(a)).pow(b);
                array.add(pow);
            }
        }
        return String.valueOf(array.size());
    }
    
}
