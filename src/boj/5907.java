import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int result = 0;

            while (num > 0) {
                result += num % 2;
                num /= 2;
            }

            System.out.println(result);
        }

        sc.close();
    }
}