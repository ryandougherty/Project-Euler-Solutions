/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems1_100;

import java.math.BigInteger;
import java.util.ArrayList;
import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author redoughe
 */
public class Problem46 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem46().run());
    }
    
    private ArrayList<BigInteger> array = new ArrayList<>();
    private BigInteger integer = BigInteger.ONE;
    
    @Override
    public String run() {
        generatePrimes();
        return "";
    }

    private void generatePrimes() {
        for (int i = 1; i < 1000000; i++) {
            integer = integer.nextProbablePrime();
            array.add(new BigInteger(integer.toString()));
        }
    }
    
}
