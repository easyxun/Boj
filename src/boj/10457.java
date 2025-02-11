import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[][] graph = new int[N+1][N+1];
            boolean[] visited = new boolean[N+1];

            for (int i = 0; i < M; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph[a][b] = graph[b][a] = 1;
            }

            int A = sc.nextInt();
            int B = sc.nextInt();

            int[] dist = new int[N+1];
            int[] prev = new int[N+1];

            for (int i = 1; i <= N; i++) {
                dist[i] = Integer.MAX_VALUE;
                prev[i] = -1;
            }

            dist[A] = 0;

            for (int i = 1; i <= N; i++) {
                int minDist = Integer.MAX_VALUE;
                int minVertex = -1;

                for (int j = 1; j <= N; j++) {
                    if (!visited[j] && dist[j] < minDist) {
                        minDist = dist[j];
                        minVertex = j;
                    }
                }

                visited[minVertex] = true;

                for (int j = 1; j <= N; j++) {
                    if (!visited[j] && graph[minVertex][j] != 0 && dist[minVertex] + graph[minVertex][j] < dist[j]) {
                        dist[j] = dist[minVertex] + graph[minVertex][j];
                        prev[j] = minVertex;
                    }
                }
            }

            int result = 0;
            int cur = B;

            while (prev[cur] != -1) {
                if (dist[cur] - dist[prev[cur]] == 1) {
                    result++;
                }
                cur = prev[cur];
            }

            System.out.println(result);
        }

        sc.close();
    }
}