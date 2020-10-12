import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int testCases = in.nextInt();
        in.nextLine(); //check 30days of code (day1) 
        
        while (testCases > 0) {

            String string = in.nextLine();
            char[] array = string.toCharArray();
            
            String strOdd = "";
            String strEven = "";
            
            for (int j=0; j<string.length(); j++) {
                if(j%2 == 0) {
                    strEven = strEven + array[j]; /
                } else {
                    strOdd = strOdd + array[j]; 
                }
            }
            
            System.out.println(strEven+" "+strOdd);  
            // System.out.println(testCases); //remove this after bug
                
            testCases -= 1;
        }
    }
}
