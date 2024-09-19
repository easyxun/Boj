import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            long max = (n + 1) * (n + 2) / 2 - 1;
            System.out.println(max);
        }

        sc.close();
    }
}