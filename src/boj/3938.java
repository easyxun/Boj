import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int result = 1;
            
            for (int i = 2; i <= n; i++) {
                result *= i;
                result %= 10;
            }

            System.out.println(result);
        }

        sc.close();
    }
}