/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manualbinarysearch;

/**
 *
 * @author New Dynamic
 */
public class ManualBinarySearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] f={23,26,78,90,123,768,900};
        System.out.println(binarySearch(f,768));
    }
    private static int binarySearch(int[] integerNumber,int numberToFind)
    {
        int low=0;
        int high = integerNumber.length -1;
        while(low<=high)
        {
            int middlePosition = (low+high)/2;
            int middleNumber = integerNumber[middlePosition];
            if(middleNumber == numberToFind)
            {
                return middlePosition;
            }
            if(numberToFind<middleNumber)
            {
                high = middlePosition-1;
            }
            else
            {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
    
}
