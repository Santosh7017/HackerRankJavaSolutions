import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the simpleArraySum function below.
     */
    public static void main(String[] args) {
        /*
         * Write your code here.
         */
         Scanner in = new Scanner(System.in);
         int sum = 0;
         int n = in.nextInt();
         int ar[] = new int[n];
         Scanner sc = new Scanner(System.in);
         for(int i = 0;i<ar.length;i++){
             ar[i] = in.nextInt();
         }
         for(int i = 0;i<ar.length;i++){
             sum = sum+ar[i];
         }
         System.out.println(sum);
        
         
    }
    
}

   
