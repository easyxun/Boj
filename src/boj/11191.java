import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int result = (int)Math.pow(2, N-1);
            System.out.println(result);
        }

        sc.close();
    }
}