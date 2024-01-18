/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poweroftwo;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean isPowerOfTwo(int n) {
        for(int i=-31;i<=31;i++)
        {
            if(Math.pow(2,i)==n)
            {
                return true;
            }
        }
        return false;
    }
}
public class PowerOfTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
