import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            long[][] dp = new long[n + 1][m + 1];

            for (int i = 1; i <= n; i++) {
                dp[i][1] = i;
            }

            for (int i = 2; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    for (int k = 1; k <= j; k++) {
                        dp[j][i] += dp[k][i - 1];
                    }
                }
            }

            System.out.println(dp[n][m]);
        }
    }
}