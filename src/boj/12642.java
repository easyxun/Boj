import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += (m * i) % n;
        }

        System.out.println(result);

        scanner.close();
    }
}