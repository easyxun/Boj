import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double result = 1 / (1 + Math.pow(10, (b - a) / 400));

        System.out.println(result);
    }
}