import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total1 = 0;
        int total2 = 0;

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            total1 += a;
            total2 += b;
        }

        System.out.println(total1 + " " + total2);
    }
}