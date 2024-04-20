/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intersectionoftwoarrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> nums1set=new HashSet<>();
        Set<Integer> nums2set = new HashSet<>();
        for(int n1:nums1)
        {
            nums1set.add(n1);

        }
        for(int n2:nums2)
        {
            nums2set.add(n2);
        }
        nums1set.retainAll(nums2set);
        Integer[] retainArray = nums1set.toArray(new Integer[nums1set.size()]);
        int[] newArray = new int[retainArray.length];
        for(int i=0;i<newArray.length;i++)
        {
            newArray[i]=retainArray[i];
        }
        return newArray;
    }
}
public class IntersectionOfTwoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
