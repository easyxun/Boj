import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a == b && b == c) {
                System.out.println("Equilateral");
            } else if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Invalid");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        sc.close();
    }
}