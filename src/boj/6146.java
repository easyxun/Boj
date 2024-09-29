```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] dp = new int[n+1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = dp[i-1];
            if (i >= 3) {
                dp[i] += dp[i-3];
            }
        }

        System.out.println(dp[n]);
    }
}
```