/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseinteger;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int reverse(int x) {
        String s = Integer.toString(x);
        String m = "";
        char[] sum = s.toCharArray();
        int i = 0;
        int j = sum.length - 1;
        
        while (i < j) {
            char temp = sum[i];
            sum[i] = sum[j];
            sum[j] = temp;
            i++;
            j--;
        }
        
        for (int k = 0; k < sum.length; k++) {
            m = m + sum[k];
        }
        
        try {
            return x < 0 ? -Integer.parseInt(m.substring(0, m.length() - 1)) : Integer.parseInt(m);
        } catch (NumberFormatException e) {
            return 0; // Handle overflow by returning 0
        }
    }
}

public class ReverseInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
