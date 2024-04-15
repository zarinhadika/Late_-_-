/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romantointeger;

import java.util.HashMap;

/**
 *
 * @author New Dynamic
 */


class Solution {
    public int romanToInt(String s) {
       HashMap<Character,Integer> map = new HashMap<>();
       map.put('I',1);
        map.put('V',5);
         map.put('X',10);
          map.put('L',50);
           map.put('C',100);
            map.put('D',500);
             map.put('M',1000);
             
             int prevalue=map.get(s.charAt(0));
             int value=prevalue;
             for(int i=1;i<s.length();i++)
             {
                int currentvalue=map.get(s.charAt(i));
                if(currentvalue>prevalue)
                {
                    value=value-2*prevalue+currentvalue;
                }
                else
                {
                    value=value+currentvalue;
                }
                prevalue=currentvalue;
             }
             return value;

        
    }
}

public class RomanToInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
