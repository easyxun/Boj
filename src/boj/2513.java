import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] dp = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        
        dp[0] = a[0];
        for (int i = 1; i < n; i++) {
            dp[i] = Math.max(dp[i-1] + a[i], a[i]);
        }
        
        int[] dp2 = new int[n];
        dp2[n-1] = a[n-1];
        for (int i = n-2; i >= 0; i--) {
            dp2[i] = Math.max(dp2[i+1] + a[i], a[i]);
        }
        
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int sum = b[i];
            if (i-k >= 0) {
                sum += dp[i-k];
            }
            if (i+k < n) {
                sum += dp2[i+k];
            }
            ans = Math.max(ans, sum);
        }
        
        System.out.println(ans);
    }
}