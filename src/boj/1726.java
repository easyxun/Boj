import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[][] map = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                map[i][j] = sc.nextInt();
            }
        }

        int[][][] dp = new int[n][m][4];
        dp[0][0][0] = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                for (int d = 0; d < 4; d++) {
                    if (dp[i][j][d] == 0) continue;

                    for (int s = 1; s <= k; s++) {
                        int ni = i;
                        int nj = j;
                        if (d == 0) ni -= s;
                        else if (d == 1) nj += s;
                        else if (d == 2) ni += s;
                        else nj -= s;

                        if (ni < 0 || ni >= n || nj < 0 || nj >= m || map[ni][nj] == 1) break;

                        dp[ni][nj][d] += dp[i][j][d];
                    }

                    for (int nd = 0; nd < 4; nd++) {
                        if (d % 2 == nd % 2) continue;
                        if (dp[ni][nj][nd] == 0) continue;

                        if (dp[ni][nj][nd] == 0 || dp[ni][nj][nd] > dp[i][j][d] + 1) {
                            dp[ni][nj][nd] = dp[i][j][d] + 1;
                        }
                    }
                }
            }
        }

        int result = Integer.MAX_VALUE;
        for (int d = 0; d < 4; d++) {
            if (dp[n - 1][m - 1][d] == 0) continue;
            if (result > dp[n - 1][m - 1][d]) {
                result = dp[n - 1][m - 1][d];
            }
        }

        System.out.println(result);
    }
}