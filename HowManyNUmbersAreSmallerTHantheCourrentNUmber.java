/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package howmanynumbersaresmallerthanthecourrentnumber;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] newArray = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[j]<nums[i])
                    {
                        count++;
                    }
                }
            }
            newArray[i]=count;
        }
        return newArray;
    }
}
public class HowManyNUmbersAreSmallerTHantheCourrentNUmber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
