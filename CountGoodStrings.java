/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countgoodstrings;

/**
 *
 * @author New Dynamic
 * 
 */
class Solution {
    public int countGoodSubstrings(String s) {
        int sum = 0;
        for(int i=0;i<s.length()-2;i++)
        {
            if(s.charAt(i)!=s.charAt(i+1) && s.charAt(i+1)!=s.charAt(i+2) && s.charAt(i+2)!=s.charAt(i))
            {
                sum=sum+1;
            }
        }
        return sum;
    }
}
public class CountGoodStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
