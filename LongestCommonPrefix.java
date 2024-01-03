/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestcommonprefix;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String prefix = strs[0];
        for(int i=1;i<strs.length;i++)
        {
            while(strs[i].indexOf(prefix)!=0)
            {
                prefix= prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
public class LongestCommonPrefix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
