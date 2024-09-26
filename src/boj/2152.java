import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            adjList.add(new ArrayList<>());
        }
        
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
        }
        
        int[] dp = new int[N+1];
        Arrays.fill(dp, -1);
        dp[S] = 0;
        
        Queue<Integer> queue = new LinkedList<>();
        queue.add(S);
        
        while (!queue.isEmpty()) {
            int cur = queue.poll();
            
            for (int next : adjList.get(cur)) {
                if (dp[next] == -1) {
                    dp[next] = dp[cur] + 1;
                    queue.add(next);
                }
            }
        }
        
        int maxDist = 0;
        int numMax = 0;
        
        for (int i = 1; i <= N; i++) {
            if (dp[i] > maxDist) {
                maxDist = dp[i];
                numMax = 1;
            } else if (dp[i] == maxDist) {
                numMax++;
            }
        }
        
        System.out.println(maxDist + " " + numMax);
    }
}