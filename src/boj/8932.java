import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int t = 0; t < T; t++) {
            int sum = 0;

            for (int i = 0; i < 8; i++) {
                int score = sc.nextInt();
                sum += score;
            }

            System.out.println(sum);
        }

        sc.close();
    }
}