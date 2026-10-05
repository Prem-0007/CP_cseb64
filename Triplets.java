import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int x=sc.nextInt();
        
        Arrays.sort(a);
        boolean found=false;
        int sum=0;
        for(int i=0;i<n-2;i++){
            int left=i+1;
           int right=n-1;
            while(left<right){
                sum=a[i]+a[left]+a[right];
                if(sum==x){
                    System.out.println(a[i]+" "+a[left]+" "+a[right]);
                    found=true;
                    left++;
                    right--;
                }
                else if(sum<x){
                    left++;
                }
                else {
                    right--;
                }
                
            }
        }
        if(!found){
            System.out.println("No Triplet Found");
        }
    }
}
