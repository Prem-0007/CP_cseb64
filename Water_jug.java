import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution { 
    public static void main(String[] args) {       
        Scanner sc = new Scanner(System.in);   
        if (sc.hasNextInt()) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt(); 
            int target = sc.nextInt(); 
            
            int gcd = findGCD(num1, num2);       
            if (target % gcd != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        sc.close();
    }
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return Math.abs(a); 
    }
}
