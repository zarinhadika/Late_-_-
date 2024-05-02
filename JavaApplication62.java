/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication62;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 *
 * @author New Dynamic
 */
public class JavaApplication62 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Set<Integer> s = new HashSet<>();
  s.add(1);
  s.add(2);
  s.add(3);
  s.add(4);
  s.add(5);
  Iterator<Integer> siterator = s.iterator();
  while(siterator.hasNext())
  {
      System.out.println(siterator.next());
  }
  
    }
    
}
