import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int[][] dp = new int[n+1][m+1];
        
        dp[1][1] = 1;
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 && j == 1) continue;
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        if (k == 0) {
            System.out.println(dp[n][m]);
        } else {
            int x = (k-1) / m + 1;
            int y = (k-1) % m + 1;
            int result = dp[x][y] * dp[n-x+1][m-y+1];
            System.out.println(result);
        }
    }
}