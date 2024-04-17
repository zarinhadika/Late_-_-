/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package setmismatch;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int[] findErrorNums(int[] nums) {
      Set<Integer> set = new HashSet<>();
      int duplicate=-1;
      int missing =-1;
      for(int s:nums)
      {
        if(!set.add(s))
        {
           duplicate=s;
        }
      }
      for(int i=1;i<=nums.length;i++)
      {
        if(!set.contains(i))
        {
            missing=i;
        }
      }
      return new int[] {duplicate,missing};
    }
}
public class SetMismatch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
