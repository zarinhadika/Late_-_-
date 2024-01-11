/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstuniquecharacterinstringpart2;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int firstUniqChar(String s) {
       int occurrence =-1;
        for(char num:s.toCharArray())
        {
            if(s.indexOf(num)==s.lastIndexOf(num))
            {
                occurrence = s.indexOf(num);
                break;
            }
        }
        return occurrence;
    }
}
public class FirstUniqueCharacterInStringPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
