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
public class Problem6 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem6().run());
    }
    
    @Override
    public String run() {
        /*
        It is known that 1 + 2 + ... + n = n*(n+1)/2,
        So (1+2+...+100)^2 = (100*101/2)^2 = 5050^2.
        
        Also, it is also known that 1^2 + ... + n^2 = n*(n+1)*(2n+1)/6,
        So 1^2+...+100^2 = 100*101*201/6 = 2030100/6 = 338350
        
        5050^2 - 338350 = 25164150.
        */
        return "25164150";
    }
    
}
