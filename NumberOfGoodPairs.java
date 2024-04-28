/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberofgoodpairs;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i<j)
                {
                    if(nums[i]==nums[j])
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
public class NumberOfGoodPairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
