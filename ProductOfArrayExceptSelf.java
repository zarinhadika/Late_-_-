/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package productofarrayexceptself;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int N=nums.length;
    int[] left_products= new int[N];
    int[] right_products= new int[N];
    int[] answer = new int[N];
    left_products[0]=1;
    right_products[N-1]=1;
    for(int i=1;i<N;i++) 
    {
        left_products[i]=nums[i-1]*left_products[i-1];
    }
     for(int i=N-2;i>=0;i--) 
    {
        right_products[i]=nums[i+1]*right_products[i+1];
    }
    for(int i=0;i<N;i++)
    {
        answer[i]=left_products[i]*right_products[i];

    }
    return answer;
    }
}
public class ProductOfArrayExceptSelf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
