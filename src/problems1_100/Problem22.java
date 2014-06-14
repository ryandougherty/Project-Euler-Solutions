/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package problems1_100;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author Ryan
 */
public class Problem22 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem22().run());
    }
    
    @Override
    public String run() {
        try {
            File f = new File("Problem22.txt");
            Scanner s = new Scanner(f);
            String[] array = s.next().split(",");
            for (int i = 0; i < array.length; i++) {
                array[i] = array[i].substring(1).substring(0, array[i].length()-2);
            }
            Arrays.sort(array);
            BigInteger sum = BigInteger.ZERO;
            for (int i = 0; i < array.length; i++) {
                long ans = evaluate(array[i])*(i+1);
                sum = sum.add(BigInteger.valueOf(ans));
            }
            return sum.toString();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    private int evaluate(String string) {
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            sum += (string.charAt(i) - 'A')+1;
        }
        return sum;
    }
    
}
