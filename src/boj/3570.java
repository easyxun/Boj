import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int s = sc.nextInt();
        int t = sc.nextInt();

        int[][] graph = new int[n][n];
        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            int w = sc.nextInt();
            graph[u][v] = w;
            graph[v][u] = w;
        }

        int[] stops = new int[k];
        for (int i = 0; i < k; i++) {
            stops[i] = sc.nextInt();
        }

        int[][] dist = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dist[i][j] = graph[i][j];
            }
        }

        for (int stop : stops) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (dist[i][stop] + dist[stop][j] < dist[i][j]) {
                        dist[i][j] = dist[i][stop] + dist[stop][j];
                    }
                }
            }
        }

        System.out.println(dist[s][t]);

        sc.close();
    }
}