import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        for (int i = 0; i < k; i++) {
            n = n % 2 == 0 ? n / 2 : n - 1;
        }

        System.out.println(n);
    }
}