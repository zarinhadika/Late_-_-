/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minimizestringlength;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> set = new HashSet<>();
        for(char nyanpasu:s.toCharArray())
        {
            set.add(nyanpasu);
        }
        return set.size();
    }
}
public class MinimizeStringLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
