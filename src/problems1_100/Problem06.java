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
public class Problem06 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem06().run());
    }
    
    private int n = 100;
    
    @Override
    public String run() {
        /*
        It is known that 1 + 2 + ... + n = n*(n+1)/2,
        
        Also, it is also known that 1^2 + ... + n^2 = n*(n+1)*(2n+1)/6,

        So the subtraction of the two is:
        
        n^2*(n+1)^2/4 - n*(n+1)*(2n+1)/6
        = (3n^2*(n+1)^2 - 2n*(n+1)*(2n+1))/12
        = n*(n+1)*(3n*(n+1) - 2*(2n+1))/12
        = n*(n+1)*(3n^2 + 3n - 4n - 2)/12
        = n*(n+1)*(3n^2 - n - 2)/12
        = n*(n+1)*(3n+2)*(n-1)/12
        
        */
        return String.valueOf(n*(n+1)*(3*n+2)*(n-1)/12);
    }
    
}
