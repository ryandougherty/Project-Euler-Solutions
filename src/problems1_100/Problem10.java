package problems1_100;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.math.BigInteger;
import projecteulerinterface.ProjectEulerInterface;

/**
 *
 * @author redoughe
 */
public class Problem10 implements ProjectEulerInterface {

    public static void main(String[] args) {
        System.out.println(new Problem10().run());
    }
    
    @Override
    public String run() {
        int min = 2;
        int max = 2000000;
        long sum = 0L;
        for (int i = min; i <= max; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return String.valueOf(sum);
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
