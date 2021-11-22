import java.io.*;
import java.util.*;

public class Solution {
   static int a;
   static int b;
   
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Solution.a = sc.nextInt();
    Solution.b = sc.nextInt();
    int area = 0;
    if(a>0 && b>0){
    area = a*b;
    System.out.println(area);
    }else{
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    
    }
}
