import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] population = new int[n];
        for (int i = 0; i < n; i++) {
            population[i] = sc.nextInt();
        }
        
        int[][] graph = new int[n][n];
        for (int i = 0; i < n-1; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u-1][v-1] = 1;
            graph[v-1][u-1] = 1;
        }
        
        int[][] dp = new int[n][2];
        boolean[] visited = new boolean[n];
        
        dfs(0, population, graph, dp, visited);
        
        System.out.println(Math.max(dp[0][0], dp[0][1]));
    }
    
    public static void dfs(int cur, int[] population, int[][] graph, int[][] dp, boolean[] visited) {
        visited[cur] = true;
        dp[cur][0] = 0;
        dp[cur][1] = population[cur];
        
        for (int i = 0; i < graph.length; i++) {
            if (graph[cur][i] == 1 && !visited[i]) {
                dfs(i, population, graph, dp, visited);
                dp[cur][0] += Math.max(dp[i][0], dp[i][1]);
                dp[cur][1] += dp[i][0];
            }
        }
    }
}