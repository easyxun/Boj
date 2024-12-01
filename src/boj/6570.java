import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int result = n * m / 2;
            System.out.println(result);
        }

        sc.close();
    }
}