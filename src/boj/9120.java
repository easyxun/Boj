import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            if (n == 0 && m == 0 && k == 0) {
                break;
            }
            
            int result = 0;
            while (n > 0 && m > 0) {
                if (n >= m) {
                    n -= m;
                    result++;
                } else {
                    m -= n;
                    result++;
                }
            }
            
            if (result % 2 == 0) {
                System.out.println("lose");
            } else {
                System.out.println("win");
            }
        }
        
        sc.close();
    }
}