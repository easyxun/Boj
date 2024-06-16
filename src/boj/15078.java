import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();

        long result = Math.max(0, a) + Math.max(0, b) + Math.max(0, c);
        System.out.println(result);

        sc.close();
    }
}