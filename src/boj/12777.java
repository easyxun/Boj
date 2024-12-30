import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int result = solve(n, a, b);
        System.out.println(result);
    }
    
    public static int solve(int n, int a, int b) {
        int count = 0;
        
        while (n > 0) {
            if (n % 2 == 1) {
                count += a;
            } else {
                count += b;
            }
            n /= 2;
        }
        
        return count;
    }
}