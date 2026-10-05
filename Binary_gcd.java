import java.util.*;
import java.io.*;
public class Bgcd {
public static int gcd(int a, int b) {
int shift =0;
if(a == 0){
return b;
}
if(b == 0){
return a;
}
while(a % 2 == 0  && b % 2 == 0){
a = a/2;
b= b/2;
shift ++;
}
while(b !=0)
{
while(b % 2 == 0 ) {
b  = b/2;
}
if ( a> b) {
int temp = a;
a= b;
b = temp;
}
b= b-a;
}
return a * (int)Math.pow(2, shift);
}
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
 int n1 = sc.nextInt();
 int n2= sc.nextInt();
 System.out.print(gcd(n1,n2));
}
}
