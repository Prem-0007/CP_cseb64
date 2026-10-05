import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt();
        int E = sc.nextInt();

        int[][] a = new int[V][V];

        for (int i = 0; i < E; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int c = sc.nextInt();
            a[u][v] += c;
        }

        int ans = 0;

        while (true) {
            int[] p = new int[V];
            Arrays.fill(p, -1);
            p[0] = 0;

            Queue<Integer> q = new LinkedList<>();
            q.add(0);

            while (!q.isEmpty()) {
                int u = q.poll();

                for (int v = 0; v < V; v++) {
                    if (a[u][v] > 0 && p[v] == -1) {
                        p[v] = u;
                        q.add(v);
                    }
                }
            }

            if (p[V - 1] == -1)
                break;

            int flow = Integer.MAX_VALUE;
            int v = V - 1;

            while (v != 0) {
                int u = p[v];
                flow = Math.min(flow, a[u][v]);
                v = u;
            }

            v = V - 1;

            while (v != 0) {
                int u = p[v];
                a[u][v] -= flow;
                a[v][u] += flow;
                v = u;
            }

            ans += flow;
        }

        System.out.println(ans);
    }
}
