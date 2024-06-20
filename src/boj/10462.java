import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 1; t <= T; t++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }

            int[][] dp = new int[N][N];

            for (int len = 2; len <= N; len++) {
                for (int i = 0; i + len - 1 < N; i++) {
                    int j = i + len - 1;
                    dp[i][j] = Math.max(arr[i] - dp[i + 1][j], arr[j] - dp[i][j - 1]);
                }
            }

            System.out.println("Case #" + t + ": " + dp[0][N - 1]);
        }
    }
}