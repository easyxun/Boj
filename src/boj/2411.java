import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int A = sc.nextInt();
        int B = sc.nextInt();

        int[][] map = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                map[i][j] = 0;
            }
        }

        int obstacle = sc.nextInt();
        for (int i = 0; i < obstacle; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            map[x-1][y-1] = -1;
        }

        int[][] dp = new int[N][M];
        dp[0][0] = 1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (map[i][j] == -1) {
                    continue;
                }

                if (i-1 >= 0 && map[i-1][j] != -1) {
                    dp[i][j] += dp[i-1][j];
                }
                if (j-1 >= 0 && map[i][j-1] != -1) {
                    dp[i][j] += dp[i][j-1];
                }
            }
        }

        System.out.println(dp[A-1][B-1]);
    }
}