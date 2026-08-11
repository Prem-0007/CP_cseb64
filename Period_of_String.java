import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        String s = scanner.nextLine();
        int n = s.length();
  
        for (int p = 1; p <= n; p++) {
            boolean period = true;

            for (int i = 0; i < n - p; i++) {
                if (s.charAt(i) != s.charAt(i + p)) {
                     period = false;
                    break; 
                }
            }

         if (period) {
                System.out.println(p);
                break;
            }
        }

        scanner.close();
    }
}
