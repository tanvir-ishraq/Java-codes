import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result;
        
        int i = 1;
        do {
            result = n * i;
            System.out.println(n+" x "+ i +" = "+result);
            i += 1;
        } while (i <= 10);
    }
}
