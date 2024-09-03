import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];
            int[] count = new int[N+1];

            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
            }

            for (int j = 0; j < N; j++) {
                B[j] = sc.nextInt();
            }

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (A[j] == B[k]) {
                        count[j+1]++;
                    }
                }
            }

            int max = 0;
            for (int j = 0; j < N+1; j++) {
                if (count[j] > max) {
                    max = count[j];
                }
            }

            System.out.println(N - max);
        }

        sc.close();
    }
}