import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s2 = sc.nextLine();
        
        int sum = s.length() + s2.length();
        System.out.println(sum);
        
        if(s.compareTo(s2)>0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        char c1 = s.charAt(0);
        char c2 = s2.charAt(0);
        String a = Character.toUpperCase(c1)+s.substring(1);
        String b = Character.toUpperCase(c2)+s2.substring(1);
        System.out.println(a+" "+b);
    }
}
