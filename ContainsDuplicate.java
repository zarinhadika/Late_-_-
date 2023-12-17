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
    public boolean containsNearbyDuplicate(int[] nums, int k) {     Set<Integer> setting = new HashSet<>();
      for(int left = 0;left<nums.length;left++)
      {
          if(left>k) setting.remove(nums[left-k-1]);
          if(!setting.add(nums[left])) return true;
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
