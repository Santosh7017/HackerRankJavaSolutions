import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if(s1.length() == s2.length()){
        String s11 = s1.toLowerCase();
       String s22 =  s2.toLowerCase();
        char str1[] = s11.toCharArray();
        Arrays.sort(str1);
        char str2[] = s22.toCharArray();
      Arrays.sort(str2);
      int flag = 0;
     for (int i = 0; i < s1.length(); i++){
            if (str1[i] == str2[i]){
                flag = 0;
            }else{
                flag = 1;
                break;
            }
     }
     if(flag ==0){
         System.out.println("Anagrams");
     }else{
         System.out.println("Not Anagrams ");
     }
        }else{
            System.out.println("Not Anagrams ");
        }
    }
}
