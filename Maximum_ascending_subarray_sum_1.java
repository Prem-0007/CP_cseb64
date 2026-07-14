import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
  public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int maxsum=sum;
        for(int i=1;i<n;i++){
         if(arr[i]>arr[i-1]){
            sum+=arr[i];
         }else{
            sum=arr[i];
         }
          maxsum=Math.max(maxsum,sum);
        }
        System.out.print(maxsum);
    }
}
