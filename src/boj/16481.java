import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r1 = sc.nextDouble();
        double r2 = sc.nextDouble();
        double r3 = sc.nextDouble();

        double result = r1 * r2 * r3 / (r1 * r2 + r2 * r3 + r3 * r1);

        System.out.println(result);
    }
}