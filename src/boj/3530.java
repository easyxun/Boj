import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long K = sc.nextLong();

            long result = 1;
            for (long j = 0; j < K; j++) {
                result = result * N % 1000000007;
            }

            System.out.println(result);
        }

        sc.close();
    }
}