import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n + 1];
        Arrays.fill(dp, 1, n + 1, 1);

        for (int i = 2; i <= n; i++) {
            int k = 2;
            while (i - Math.pow(2, k) >= 0) {
                dp[i] = Math.max(dp[i], dp[i - (int) Math.pow(2, k)] + k);
                k++;
            }
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            answer = Math.max(answer, dp[i]);
        }

        System.out.println(answer);
    }
}