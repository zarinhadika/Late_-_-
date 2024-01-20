/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package containsduplicate;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setter = new HashSet<>();
        for(int num:nums)
        {
            if(setter.contains(num))
            {
                return true;
            }
            setter.add(num);

        }
        return false;
    }
}
public class ContainsDuplicate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
