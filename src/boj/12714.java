import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if (n == 0) {
            System.out.println(0);
        } else {
            int result = (int) Math.pow(2, n) - 1;
            System.out.println(result);
        }
    }
}