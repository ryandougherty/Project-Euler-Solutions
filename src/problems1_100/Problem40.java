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
public class Problem40 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem40().run());
    }

    private final StringBuilder sb = new StringBuilder();
    private final int min = 1, max = 1000000;
    private final int[] indices = {0, 9, 99, 999, 9999, 99999, 999999};
    
    
    @Override
    public String run() {
        for (int i = min; i <= max; i++) {
            sb.append(i);
        }
        String s = sb.toString();
        int result = 1;
        for (int c : indices) {
            result *= Integer.parseInt(s.substring(c, c+1));
        }
        return String.valueOf(result);
    }
    
}
