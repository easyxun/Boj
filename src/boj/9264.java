import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            
            if (a + b == c) {
                System.out.println("Possible");
            } else if (a - b == c || b - a == c) {
                System.out.println("Possible");
            } else if (a * b == c) {
                System.out.println("Possible");
            } else if (a % b == 0 && a / b == c) {
                System.out.println("Possible");
            } else if (b % a == 0 && b / a == c) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
        
        sc.close();
    }
}