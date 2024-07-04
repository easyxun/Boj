import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        if (n % 2 == 0) {
            if (m % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        } else {
            if (m % 2 == 0) {
                System.out.println("no");
            } else {
                System.out.println("yes");
            }
        }

        sc.close();
    }
}