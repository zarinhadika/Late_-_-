/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findpeakelement;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int findPeakElement(int[] nums) {
     int m=nums[0];
     int position =0;
   for(int i=1;i<nums.length;i++)
   {
       if(m<=nums[i])
       {
           m=nums[i];
           position=i;
       }
   }
   return position;
  
    }
}
public class FindPeakElement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // String s="Sawry";
       
    }
    
}
