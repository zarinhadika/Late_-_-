/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package climblingstairs;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public int climbStairs(int n) {
        int[] a=new int[n+1];
        a[0]=1;
        a[1]=1;
       if(n<=1)
       {
           return n;
       }
       else
       {
           for(int i=2;i<=n;i++)
           {
               a[i]=a[i-2]+a[i-1];
           }
       }
       return a[n];
    }
}
public class ClimblingStairs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
