/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestinteger;

import java.util.Arrays;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public String largestNumber(int[] nums) {
        String result = Arrays.stream(nums)
            .boxed()
            .map(Object::toString)
            .sorted((a, b) -> (b + a).compareTo(a + b))
            .reduce((x, y) -> x + y)
            .orElse("0");

        // Handle leading zeros
        
if (result.charAt(0) == '0') { return "0"; }
        return result;
    }
}
public class LargestInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
}
