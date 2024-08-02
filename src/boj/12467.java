import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long result = 1;

            for (long j = 2; j * j <= N; j++) {
                int cnt = 0;
                while (N % j == 0) {
                    N /= j;
                    cnt++;
                }
                if (cnt % 2 == 1) {
                    result *= j;
                }
            }

            if (N > 1) {
                result *= N;
            }

            System.out.println(result);
        }
    }
}