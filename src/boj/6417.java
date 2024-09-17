import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 1;
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            double sum = 0;
            for (int i = 0; i < n; i++) {
                sum += sc.nextDouble();
            }

            double avg = sum / n;

            System.out.println("Size #" + count++ + ":");
            System.out.printf("Minimum: %.2f\n", avg);
            System.out.printf("Maximum: %.2f\n", avg);
            System.out.printf("Average: %.2f\n\n", avg);
        }

        sc.close();
    }
}