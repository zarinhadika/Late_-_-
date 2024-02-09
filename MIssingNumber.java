/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package missingnumber;

import java.util.Arrays;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int missingNumber(int[] nums) {
       Arrays.sort(nums);
       int n=nums.length;
       for(int i=0;i<n;i++)
       {
           if(nums[i]!=i)
           {
               return i;
           }
       }
       return n;
    }
}
public class MIssingNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
