import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int[] cards = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                cards[i] = i;
            }

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int temp = cards[a];
                cards[a] = cards[b];
                cards[b] = temp;
            }

            for (int i = 1; i <= n; i++) {
                System.out.print(cards[i] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}