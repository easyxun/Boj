import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int alice = 0;
        int bob = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                alice += i;
            } else {
                bob += i;
            }
        }

        System.out.println(alice + " " + bob);
    }
}