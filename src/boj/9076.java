import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int[] scores = new int[5];
            for (int j = 0; j < 5; j++) {
                scores[j] = sc.nextInt();
            }

            Arrays.sort(scores);

            if (scores[3] - scores[1] >= 4) {
                System.out.println("KIN");
            } else {
                int sum = scores[1] + scores[2] + scores[3];
                System.out.println(sum);
            }
        }

        sc.close();
    }
}