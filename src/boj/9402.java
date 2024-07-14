import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int[][] map = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    map[i][j] = sc.nextInt();
                }
            }

            int[][] dp = new int[N][M];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    dp[i][j] = map[i][j];
                    if (i > 0) dp[i][j] += dp[i - 1][j];
                    if (j > 0) dp[i][j] += dp[i][j - 1];
                    if (i > 0 && j > 0) dp[i][j] -= dp[i - 1][j - 1];
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    for (int k = i; k < N; k++) {
                        for (int l = j; l < M; l++) {
                            int sum = dp[k][l];
                            if (i > 0) sum -= dp[i - 1][l];
                            if (j > 0) sum -= dp[k][j - 1];
                            if (i > 0 && j > 0) sum += dp[i - 1][j - 1];
                            if (sum <= K) {
                                int area = (k - i + 1) * (l - j + 1);
                                max = Math.max(max, area);
                            }
                        }
                    }
                }
            }

            System.out.println(max);
        }

        sc.close();
    }
}