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

            int[][] map = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int[][] dp = new int[n][m];
            dp[0][0] = map[0][0];

            for (int i = 1; i < n; i++) {
                dp[i][0] = dp[i-1][0] + map[i][0];
            }

            for (int j = 1; j < m; j++) {
                dp[0][j] = dp[0][j-1] + map[0][j];
            }

            for (int i = 1; i < n; i++) {
                for (int j = 1; j < m; j++) {
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]) + map[i][j];
                }
            }

            System.out.println(dp[n-1][m-1]);
        }

        sc.close();
    }
}