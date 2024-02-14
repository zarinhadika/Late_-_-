/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversewordsinastring;

/**
 *
 * @author New Dynamic
 */
class Solution {
    public String reverseWords(String s) {
      String t=s.trim();
      String[] str=t.split("\\s+");
      StringBuilder stri = new StringBuilder();
      for(int i=str.length-1;i>=0;i--)
      {
          stri.append(str[i]);
          if(i>0)
          {
              stri.append(" ");
          }
      }
      return stri.toString();
        
        
    }
}
public class ReverseWordsInAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
