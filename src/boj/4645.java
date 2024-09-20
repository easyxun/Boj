import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            double sum = 0;

            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
                max = Math.max(max, num);
                min = Math.min(min, num);
            }

            double avg = sum / n;
            System.out.println((int)avg + " " + max + " " + min);
        }

        sc.close();
    }
}