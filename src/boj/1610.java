import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int[] dp = new int[N + 1];
        int result = 0;
        for (int i = 1; i <= N; i++) {
            dp[i] = i - 1;
            for (int j = i - 1; j >= 1; j--) {
                if (arr[i] - arr[j] > K) {
                    break;
                }
                dp[i] = Math.min(dp[i], dp[j] + i - j - 1);
            }
            result = Math.max(result, dp[i] + N - i);
        }
        
        System.out.println(result);
    }
}