import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int result = n * m * k - n - m - k + 1;
        
        System.out.println(result);

        sc.close();
    }
}