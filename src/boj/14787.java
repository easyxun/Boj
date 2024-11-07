import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        int result = 0;
        for (int i = 1; i <= n; i++) {
            if (x % i == 0 && y % i == 0) {
                result++;
            }
        }

        System.out.println(result);
    }
}