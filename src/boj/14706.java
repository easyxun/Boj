import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if (n * m < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}