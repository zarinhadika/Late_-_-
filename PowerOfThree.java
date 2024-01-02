/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package powerofthree;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean isPowerOfThree(int n) {
       if(n==1) return true;
       if(n%3!=0 || n==0) return false;
       return isPowerOfThree(n/3);
       
    }
}

public class PowerOfThree {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
