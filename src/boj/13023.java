import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        for (int i = 0; i < n; i++) {
            visited[i] = true;
            if (dfs(graph, visited, i, 1)) {
                System.out.println(1);
                return;
            }
            visited[i] = false;
        }

        System.out.println(0);
    }

    public static boolean dfs(int[][] graph, boolean[] visited, int node, int depth) {
        if (depth == 5) {
            return true;
        }

        for (int i = 0; i < graph.length; i++) {
            if (graph[node][i] == 1 && !visited[i]) {
                visited[i] = true;
                if (dfs(graph, visited, i, depth + 1)) {
                    return true;
                }
                visited[i] = false;
            }
        }

        return false;
    }
}