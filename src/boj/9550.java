import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;

            for (int j = 0; j < N; j++) {
                int candy = sc.nextInt();
                count += candy / K;
            }

            System.out.println(count);
        }

        sc.close();
    }
}