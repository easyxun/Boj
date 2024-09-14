import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int W = sc.nextInt();
        int N = sc.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[][] dp = new boolean[W + 1][2];
        dp[0][0] = true;

        for (int i = 0; i < N; i++) {
            for (int j = W; j >= arr[i]; j--) {
                if (dp[j - arr[i]][0]) {
                    if (dp[j][0]) {
                        System.out.println("YES");
                        System.exit(0);
                    }
                    dp[j][1] = true;
                }
            }

            for (int j = W; j >= arr[i]; j--) {
                if (dp[j][1]) {
                    dp[j][0] = true;
                }
            }
        }

        System.out.println("NO");
    }
}