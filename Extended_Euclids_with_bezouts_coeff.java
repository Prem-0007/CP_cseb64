import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int A=sc.nextInt();
     int B=sc.nextInt();
     int a=A;
     int b=B;
     int s1=1,s2=0,t1=0,t2=1;
   while (b != 0){
    int q = a / b;

   int r =a%b;
    int s = s1 - (s2 * q);
   int  t = t1 - (t2 * q);

    a = b;
    b = r;

    s1 = s2;
    s2 = s;

    t1 = t2;
    t2 = t;
    }
    System.out.print(s1+" "+t1+" "+a);
}
}
