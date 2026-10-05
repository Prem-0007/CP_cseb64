import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNext()) {
            System.out.println(0);
            scanner.close();
            return;
        }
        
        String A = scanner.next();
        int i = 0;
        int j = A.length() - 1;
        int length = 0;
        
        
        while (i <= j) {
            if (i == j) {
                length += 1; 
                break;
            }
            
            if (A.charAt(i) == A.charAt(j)) {
                length += 2; 
                i++;
                j--;
            } else {
               
                if (i + 1 < A.length() && A.charAt(i + 1) == A.charAt(j)) {
                    i++;
                } else if (j - 1 >= 0 && A.charAt(i) == A.charAt(j - 1)) {
                    j--;
                } else {
               
                    i++;
                    j--;
                }
            }
        }
        
        System.out.println(length);
        scanner.close();
    }
}
