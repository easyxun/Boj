import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int s = sc.nextInt();
        int m = sc.nextInt();

        int[][] dp = new int[n + 1][m + 1];
        dp[0][s] = 1;

        for (int i = 1; i <= n; i++) {
            int v = sc.nextInt();
            for (int j = 0; j <= m; j++) {
                if (dp[i - 1][j] == 0) continue;
                if (j - v >= 0) dp[i][j - v] = 1;
                if (j + v <= m) dp[i][j + v] = 1;
            }
        }

        int result = -1;
        for (int i = m; i >= 0; i--) {
            if (dp[n][i] == 1) {
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}