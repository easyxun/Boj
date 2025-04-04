import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = 0;
            int num = sc.nextInt();

            while (num > 0) {
                if (num % 2 == 1) {
                    count++;
                }
                num /= 2;
            }

            System.out.println(count);
        }
    }
}