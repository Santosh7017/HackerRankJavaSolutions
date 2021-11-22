import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String s1 = "";
    for(int i = 0;i<s.length();i++){
        char ch = s.charAt(i);
        s1 = ch +s1;
    }
    if(s.equalsIgnoreCase(s1)){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
    }
}
