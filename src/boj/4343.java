import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            double max = 0;

            for (int j = 0; j < m; j++) {
                double x = sc.nextDouble();
                double y = sc.nextDouble();

                double distance = Math.sqrt(x * x + y * y);
                max = Math.max(max, distance);
            }

            System.out.printf("%.2f\n", max);
        }

        sc.close();
    }
}