import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] dp = new int[300001];
        int[] sum = new int[300001];
        
        for (int i = 1; i <= 300000; i++) {
            sum[i] = sum[i-1] + i;
        }
        
        for (int i = 1; i <= N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        dp[0] = 0;
        
        for (int i = 1; i <= N; i++) {
            for (int j = 1; sum[j] <= i; j++) {
                dp[i] = Math.min(dp[i], dp[i - sum[j]] + 1);
            }
        }
        
        System.out.println(dp[N]);
    }
}