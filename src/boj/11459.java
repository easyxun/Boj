import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] board = new int[101];
            for (int j = 1; j <= 100; j++) {
                board[j] = j;
            }

            for (int j = 0; j < N + M; j++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                board[x] = y;
            }

            int current = 1;
            while (current <= 100) {
                current = board[current];
            }

            System.out.println(current);
        }

        sc.close();
    }
}