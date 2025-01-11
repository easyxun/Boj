import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int D = sc.nextInt();
            int result = 0;

            while (result <= D) {
                result++;
                D -= result;
            }

            System.out.println(result - 1);
        }
    }
}