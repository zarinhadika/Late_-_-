/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charhash;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
   int maxLength=0;
   Map<Character,Integer> visitedSubstring = new HashMap<>();
   for(int right =0 ,left = 0 ;right<s.length();right++)
   {
       if(visitedSubstring.containsKey(s.charAt(right)) && visitedSubstring.get(s.charAt(right))>=left)
       {
           left = visitedSubstring.get(s.charAt(right))+1;
       }
       maxLength = Math.max(maxLength,right-left+1);
       visitedSubstring.put(s.charAt(right),right);

   } 
      return maxLength;
    }
}
public class Charhash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
