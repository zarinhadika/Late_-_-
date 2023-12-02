/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package countbeautifulsubstrings;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int beautifulSubstrings(String s, int k) {
        char[] character = {'a','e','i','o','u'};
        Set<Character> vowels = new HashSet<>();
        int num=0;
        for(char c:character)
        {
            vowels.add(c);
        }
        for(int left=0;left<s.length();left++)
        {
            int vowel_Count=0;
            int consonant_Count=0;
            for(int right = left;right<s.length();right++)
            {
                if(vowels.contains(s.charAt(right)))
                {
                    vowel_Count++;
                }
                else
                {
                    consonant_Count++;
                }
                if(vowel_Count==consonant_Count && (vowel_Count * consonant_Count)%k==0 )
                {
                    num++;
                }
            }
        }
        return num;
        
    }
}
public class CountBeautifulSubstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
