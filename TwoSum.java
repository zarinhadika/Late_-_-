/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package two.sum;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] count = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    count[0]=i;
                    count[1]=j;
                    
                }
            }
           
        }
     return count;
    }
}
public class TwoSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
