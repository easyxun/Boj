import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == 0 && b == 0 && c == 0) {
                break;
            }

            if (b - a == c - b) {
                System.out.println("AP " + (c + (b - a)));
            } else {
                System.out.println("GP " + (c * (b / a)));
            }
        }
    }
}