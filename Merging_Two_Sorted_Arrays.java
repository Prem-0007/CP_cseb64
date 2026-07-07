import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int m=sc.nextInt();
        int a[]=new int[m];
        for(int i=0;i<m;i++){
            a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int b[]=new int[n];
        for(int j=0;j<n;j++){
            b[j]=sc.nextInt();
        }
        int res[]=new int[m+n];   
        int i=0;
        int j=0;
        int k=0;
        while(i<m && j<n){
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
        while(i<m){
                res[k]=a[i];
                k++;
                i++;
            }
            while(j<n){
                res[k]=b[j];
                k++;
                j++;
            }  
        for( k=0;k<(m+n);k++){
            System.out.print(res[k]+" ");
        }
        }         
    }
