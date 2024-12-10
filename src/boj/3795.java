import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int winner = 0;
        int maxScore = 0;

        for (int i = 0; i < n; i++) {
            int scoreA = sc.nextInt();
            int scoreB = sc.nextInt();

            int diff = Math.abs(scoreA - scoreB);

            if (scoreA > scoreB) {
                if (diff > maxScore) {
                    maxScore = diff;
                    winner = a;
                }
            } else {
                if (diff > maxScore) {
                    maxScore = diff;
                    winner = b;
                }
            }
        }

        System.out.println(winner);
    }
}