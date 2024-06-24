import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int score = sc.nextInt();
        int P = sc.nextInt();

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = sc.nextInt();
        }

        if (N == 0) {
            System.out.println("1");
            return;
        }

        int rank = 1;
        int sameRank = 0;
        for (int i = 0; i < N; i++) {
            if (score <= scores[i] && P <= 0) {
                rank = -1;
                break;
            }
            if (score < scores[i]) {
                rank++;
            }
            if (score == scores[i]) {
                sameRank++;
                if (P > 0) {
                    rank++;
                }
            }
        }

        if (P > 0) {
            rank += P - sameRank;
        }

        System.out.println(rank);
    }
}