import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n > 1022) {
            System.out.println(-1);
            return;
        }

        if (n < 10) {
            System.out.println(n);
            return;
        }

        long[] dp = new long[1023];
        for (int i = 0; i < 10; i++) {
            dp[i] = i;
        }

        int count = 10;
        long result = 0;

        while (count <= n) {
            int temp = 1;
            while (true) {
                long num = dp[temp] % 10;
                if (num == 9) {
                    temp++;
                    continue;
                }

                long newNum = num + 1;
                long newNumConcat = dp[temp] * 10 + newNum;
                if (newNumConcat > dp[temp]) {
                    dp[count] = newNumConcat;
                    count++;
                    if (count == n + 1) {
                        result = newNumConcat;
                        break;
                    }
                } else {
                    temp++;
                }
            }
        }

        System.out.println(result);
    }
}