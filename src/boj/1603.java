import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] dp = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            dp[i][1] = i;
        }

        for (int i = 2; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[j][i] = dp[j - 1][i] + dp[j][i - 1];
            }
        }

        System.out.println(dp[n][m]);
    }
}