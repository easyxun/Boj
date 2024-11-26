import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();

            int result = Math.min(Math.min(N/2, M), (N+M+K)/3);
            System.out.println(result);
        }

        sc.close();
    }
}