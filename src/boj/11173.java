import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int result = 0;

            for (int j = N; j > 0; j /= 2) {
                if (j % 2 == 1) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
                result++;
            }

            for (int j = result; j < K; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}