import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n != 0) {
            int count = 0;
            for (int i = 1; i <= n / 3; i++) {
                int j = (n - i) / 2;
                if (i <= j && j <= n - i - j) {
                    count++;
                }
            }
            System.out.println(count);
            n = sc.nextInt();
        }
    }
}