/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortedarray;

import java.util.Arrays;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        for(int j=0;j<n;j++)
        {
            nums1[i++]=nums2[j];
        }
        Arrays.sort(nums1);
    }
}
public class MergeSortedArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
