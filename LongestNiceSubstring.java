/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.nice.substring;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public String longestNiceSubstring(String s) {
       Set<Character> substringg = new HashSet<>();
       for(char c:s.toCharArray())
       {
           substringg.add(c);
       }
       for(int left = 0; left<s.length();left++)
       {
           if(substringg.contains(Character.toUpperCase(s.charAt(left)))&& substringg.contains(Character.toLowerCase(s.charAt(left))))
           {
               continue;
           }
           String s1 = longestNiceSubstring(s.substring(0,left));
           String s2 = longestNiceSubstring(s.substring(left+1));
           return s1.length()>=s2.length() ? s1:s2;
       }
       return s;

    }
}
public class LongestNiceSubstring {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
