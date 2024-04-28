/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstmissingpositive;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> hashset = new HashSet<>();
        for(int n:nums)
        {
            if(n>0)
            {
                hashset.add(n);
            }
        }
        for(int i=1;i<=nums.length+1;i++)
        {
            if(!hashset.contains(i))
            {
                return i;
            }
        }
        return -1;
    }
}
public class FirstMissingPositive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
