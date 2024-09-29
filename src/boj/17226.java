import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int T = sc.nextInt();

        int result = Math.max((T / (2 * M)) * N + Math.min(T % (2 * M), N), (T / (2 * N)) * M + Math.min(T % (2 * N), M));

        System.out.println(result);

        sc.close();
    }
}