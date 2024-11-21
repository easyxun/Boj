import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 1; i <= T; i++) {
            long N = sc.nextLong();
            long x = 1;
            boolean isAliceTurn = true;

            while (N > 0) {
                if (isAliceTurn) {
                    N -= x;
                } else {
                    N -= x * 2;
                }
                x *= 4;
                isAliceTurn = !isAliceTurn;
            }

            System.out.println("Case #" + i + ": " + (isAliceTurn ? "Alice" : "Bob"));
        }
    }
}