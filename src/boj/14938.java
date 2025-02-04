import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        int[] items = new int[n+1];
        int[][] graph = new int[n+1][n+1];

        for (int i = 1; i <= n; i++) {
            items[i] = sc.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            Arrays.fill(graph[i], 10000000);
            graph[i][i] = 0;
        }

        for (int i = 0; i < r; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int l = sc.nextInt();
            graph[a][b] = l;
            graph[b][a] = l;
        }

        for (int k = 1; k <= n; k++) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (graph[i][j] > graph[i][k] + graph[k][j]) {
                        graph[i][j] = graph[i][k] + graph[k][j];
                    }
                }
            }
        }

        int maxItems = 0;
        for (int i = 1; i <= n; i++) {
            int totalItems = 0;
            for (int j = 1; j <= n; j++) {
                if (graph[i][j] <= m) {
                    totalItems += items[j];
                }
            }
            maxItems = Math.max(maxItems, totalItems);
        }

        System.out.println(maxItems);

        sc.close();
    }
}