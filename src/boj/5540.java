import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int result = Math.min(Math.min(n/2, m), (n+m-k)/3);

        System.out.println(result);

        sc.close();
    }
}