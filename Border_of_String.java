import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        for (int len = n - 1; len >= 1; len--) {
            boolean same = true;

            for (int i = 0; i < len; i++) {
                if (s.charAt(i) != s.charAt(n - len + i)) {
                    same = false;
                    break;
                }
            }
            if (same) {
                System.out.println(s.substring(0, len));
                return;
            }
        }
        System.out.println("No border");
    }
}
