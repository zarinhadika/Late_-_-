/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temporary;

/**
 *
 * @author New Dynamic
 */

public class Temporary {
    String criminal_name;
    String tag_line;
    int crime_number;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Temporary criminal1=new Temporary();
        criminal1.criminal_name="Johny";
        criminal1.tag_line="MUH10XWE23";
        criminal1.crime_number=2;
        System.out.println(criminal1.criminal_name);
        System.out.println(criminal1.tag_line);
        System.out.println(criminal1.crime_number);
    }
    
}
