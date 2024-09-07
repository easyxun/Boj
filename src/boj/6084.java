import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int result = a * b * c * d / 8 / 1024 / 1024;

        System.out.println(result + " MB");

        sc.close();
    }
}