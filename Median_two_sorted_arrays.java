import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    ;
        int n=sc.nextInt();
        int m=sc.nextInt();
        
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        
        int b[]=new int[m];
        for(int j=0;j<m;j++){
            b[j]=sc.nextInt();
        }
        int s=m+n;
        int res[]=new int[s];   
        int i=0;
        int j=0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<=b[j]){
                res[k]=a[i];
                
                i++;
            }
            else{
                res[k]=b[j];
                
                j++;
            }
            k++;
            
        }
        while(i<n){
                res[k]=a[i];
                k++;
                i++;
            }
            while(j<m){
                res[k]=b[j];
                k++;
                j++;
            }  
           if (s % 2 == 0) {
         double avg = ((double) res[s/2] + res[s/2 - 1]) / 2;
              System.out.printf("%.1f", avg);
           }       
       else {
        System.out.printf("%.1f", (double) res[s/2]);
       }
        
    }
    }
