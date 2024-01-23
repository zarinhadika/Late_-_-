/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validpalindrome;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", ""); // Remove non-alphanumeric characters
        s = s.toLowerCase(); // Convert to lowercase

        int i = 0;
        int j = s.length() - 1;
        char[] siu = s.toCharArray();

        while (i < j) {
            char temp = siu[i];
            siu[i] = siu[j];
            siu[j] = temp;
            i++;
            j--;
        }

        String reversedString = new String(siu);

        return s.equals(reversedString);
    }
}

public class ValidPalindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
