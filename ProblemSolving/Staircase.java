import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numInputs = sc.nextInt();

    for(int i = 1; i <= numInputs; i++){ // rows
            
            int j = numInputs;
            
            // loop to print (size - i) spaces
            while(j-- > i) {
                System.out.print(" ");
            }
            // loop to print (i) #s
            while(j-- >= 0) {
                System.out.print("#");
            }
            
            System.out.println();
        }
        
    }
}

