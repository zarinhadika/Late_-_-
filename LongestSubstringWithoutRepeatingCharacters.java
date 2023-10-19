/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longest.substring.without.repeating.characters;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
     int maxLength = 0;   
     for(int i=0;i<s.length();i++)
     {
         StringBuilder currentStringCharacter= new StringBuilder();
         for(int j=i;j<s.length();j++)
         {
             if(currentStringCharacter.indexOf(String.valueOf(s.charAt(j)))!=-1)
             {
                 break;
             }
             currentStringCharacter.append(s.charAt(j));
             maxLength=Math.max(currentStringCharacter.length(),maxLength);
             
         }
         
     }
    return maxLength;
    }
}

public class LongestSubstringWithoutRepeatingCharacters {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
