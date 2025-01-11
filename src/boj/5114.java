import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int result = N - M;

        if (result < 0) {
            System.out.println("비행기가 늦어졌습니다.");
        } else {
            System.out.println(result);
        }

        sc.close();
    }
}