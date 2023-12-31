/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validanagram;

import java.util.Arrays;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean isAnagram(String s, String t) {
     char[] st= s.toCharArray();
     char[] tt=t.toCharArray();
     Arrays.sort(st);
     Arrays.sort(tt);
     return Arrays.equals(st,tt);

    }
}
public class ValidAnagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
