/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package first.unique.character.in.a.string;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int firstUniqChar(String s) {
        int unique=-1;
        char num;
        for(int i=0;i<s.length();i++)
        {
            num=s.charAt(i);
            if(s.indexOf(num)==s.lastIndexOf(num))
            {
                unique=i;
                break;
            }

        }
        return unique;
    }
}
public class FirstUniqueCharacterInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
