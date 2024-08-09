import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            int max = Math.max(Math.max(A, B), C);
            int min = Math.min(Math.min(A, B), C);

            int result = A + B + C - max - min;

            System.out.println(result);
        }

        sc.close();
    }
}