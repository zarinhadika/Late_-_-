/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversestring;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public void reverseString(char[] s) {
   int i = 0,j=s.length-1;
   while(i<j)
   {
       char temp= s[i];
       s[i]=s[j];
       s[j]=temp;
       i++;
       j--;
   }
    }
}
public class ReverseString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
