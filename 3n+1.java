mport java.util.*;

public class Main {

    static int cycleLength(long n) {
        int count = 1;

        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = 3 * n + 1;
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();

        int originalI = i;
        int originalJ = j;

        if (i > j) {
            int temp = i;
            i = j;
            j = temp;
        }

        int maxCycle = 0;

        for (int num = i; num <= j; num++) {
            maxCycle = Math.max(maxCycle, cycleLength(num));
        }

        System.out.println(originalI + " " + originalJ + " " + maxCycle);
    }
}
