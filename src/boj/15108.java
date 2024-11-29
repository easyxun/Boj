import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}