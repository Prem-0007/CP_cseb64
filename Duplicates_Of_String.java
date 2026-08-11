import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();
       int mask=0;
       int dup=0;
       boolean found=false;
       for(int i=0;i<s.length();i++){
        int bit=1<<(s.charAt(i)-'a');
        if((mask & bit)!=0){
          if((dup & bit)==0){
                System.out.print(s.charAt(i)+" ");
                dup =dup | bit;
                found=true;
          } 
        }
        else{
          mask=mask|bit;
        }
       }
       if(!found){
        System.out.print("No duplicates");
       }
}
}
