/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findtheduplicatenumbers;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> messi = new HashSet<>();
        for(int num:nums)
        {
            if(messi.contains(num))
            {
                return num;
            }
            messi.add(num);
        }
        return 0;
    }
}
public class FindTheDuplicateNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
