import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] cost = new int[2 * N + 1];
        
        for (int i = 1; i <= N; i++) {
            cost[i] = sc.nextInt();
        }
        
        for (int i = N + 1; i <= 2 * N; i++) {
            cost[i] = cost[i - N];
        }
        
        int[][] dp = new int[2 * N + 1][K + 1];
        
        for (int i = 1; i <= 2 * N; i++) {
            for (int j = 1; j <= K; j++) {
                dp[i][j] = dp[i - 1][j];
                
                if (j >= cost[i]) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - cost[i]] + 1);
                }
            }
        }
        
        System.out.println(dp[2 * N][K]);
    }
}