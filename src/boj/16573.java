import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        if (n % 2 == 0) {
            if (k % 2 == 0) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            if (k % 2 == 0) {
                System.out.println(0);
            } else {
                System.out.println(1);
            }
        }
    }
}