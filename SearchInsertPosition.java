/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchinsertposition;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                return i;
            }
            if(target>nums[i])
            {
                max = Math.max(max,i+1);
            }
            if(target<nums[i])
            {
                max = Math.min(max,i);
            }
        }
        return max;
    }
}
public class SearchInsertPosition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
