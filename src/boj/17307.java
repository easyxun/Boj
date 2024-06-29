import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum1 += s.charAt(i) - '0';
            } else {
                sum2 += s.charAt(i) - '0';
            }
        }

        int ans = Math.max(sum1, sum2);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                sum1 -= s.charAt(i) - '0';
            } else {
                sum2 -= s.charAt(i) - '0';
            }

            if (i % 2 == 0) {
                sum2 += s.charAt(i) - '0';
            } else {
                sum1 += s.charAt(i) - '0';
            }

            ans = Math.max(ans, Math.max(sum1, sum2));
        }

        System.out.println(ans);
    }
}