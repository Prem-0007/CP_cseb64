import java.util.*;

public class BucketSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double arr[] = new double[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextDouble();

        ArrayList<Double>[] bucket = new ArrayList[n];

        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<>();

        for (int i = 0; i < n; i++)
            bucket[(int)(arr[i] * n)].add(arr[i]);

        for (int i = 0; i < n; i++)
            Collections.sort(bucket[i]);

        int k = 0;
        for (int i = 0; i < n; i++)
            for (double x : bucket[i])
                arr[k++] = x;

       for (int i = 0; i < n; i++) {
            System.out.printf("%.2f", arr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
           
           
        sc.close();
    }
}
