import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        
        int low = 0;
        int ans = 0;
        int high = dividend;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (mid * divisor == dividend) {
                ans = mid;
                break;
            } 
            else if (mid * divisor < dividend) {
                ans = mid;
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
