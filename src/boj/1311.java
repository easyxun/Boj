import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] cost = new int[n][n];
        int[][] dp = new int[n][1 << n];
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                cost[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (1 << n); j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }
        
        dp[0][1] = 0;
        
        for (int mask = 1; mask < (1 << n); mask++) {
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) == 0) continue;
                
                for (int j = 0; j < n; j++) {
                    if ((mask & (1 << j)) == 0) continue;
                    
                    dp[i][mask] = Math.min(dp[i][mask], dp[j][mask - (1 << i)] + cost[j][i]);
                }
            }
        }
        
        System.out.println(dp[0][(1 << n) - 1]);
    }
}