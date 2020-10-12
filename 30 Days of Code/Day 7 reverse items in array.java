import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        
        int beg = 0;
        int end = n-1;
        int temp;
        for(int i=1; i<=(n/2) ; i++) {
            temp = arr[beg];
            arr[beg] = arr[end];
            arr[end] = temp;
            beg++;
            end--;
        }
        
        for(int i=0; i < n; i++){
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        
    }
}
