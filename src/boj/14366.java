import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = Math.max(Math.max(a, b), c) - Math.min(Math.min(a, b), c);

        System.out.println(result);

        sc.close();
    }
}