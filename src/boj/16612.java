import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int T = sc.nextInt();
        int C = sc.nextInt();
        int P = sc.nextInt();

        int result = ((N - 1) / T) * C * P;

        System.out.println(result);
    }
}