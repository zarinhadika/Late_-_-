/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movezeros;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public void moveZeroes(int[] nums) {
        int nonZeroIndex=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                nums[nonZeroIndex]=nums[i];
                nonZeroIndex++;
            }
        }
        while(nonZeroIndex<nums.length)
        {
            nums[nonZeroIndex]=0;
            nonZeroIndex++;
        }
    }
}
public class MoveZeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
