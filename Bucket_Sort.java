import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double[] arr = new double[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        double min = arr[0];
        double max = arr[0];

        for (int i = 1; i < n; i++) {
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }
        ArrayList<Double>[] buckets = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {

            int index;

            if (min == max) {
                index = 0;
            } else {
                index = (int)((arr[i] - min) / (max - min) * n);
                if (index == n) {
                    index = n - 1;
                }
            }

            buckets[index].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        for (int i = 0; i < n; i++) {
            for (double value : buckets[i]) {

                if (value == (int)value) {
                    System.out.print((int)value + " ");
                } else {
                    System.out.printf("%.2f ", value);
                }
            }
        }
    }
}
