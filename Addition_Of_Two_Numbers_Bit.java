import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
        while (b != 0) {
          int c = a & b;
              a = a ^ b;
               b = c << 1;
        }
     System.out.println(a);
    }
}
