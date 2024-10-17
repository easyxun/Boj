import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long result = 0;
        for (int i = 1; i <= n; i++) {
            result += i * (n - i + 1);
        }
        
        System.out.println(result);
    }
}