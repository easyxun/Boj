import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp = new int[n+1];
        int max = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            dp[num] = dp[num - 1] + 1;
            max = Math.max(max, dp[num]);
        }

        System.out.println(n - max);
    }
}