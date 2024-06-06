import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            long n = sc.nextLong();
            if (n == 0) {
                break;
            }

            long ans = n;
            while (n != 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                ans = Math.max(ans, n);
            }

            System.out.println(ans);
        }
        
        sc.close();
    }
}