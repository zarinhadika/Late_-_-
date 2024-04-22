/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poweroffour;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean isPowerOfFour(int n) {

        for(int i=-31;i<=31;i++)
        {
            if(n==Math.pow(4,i))
            {
                return true;
            }
        }
        return false;
    }
}
public class PowerOfFour {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
