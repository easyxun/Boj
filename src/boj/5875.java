import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 3;
            }
            
            if (n % 3 == 0) {
                System.out.println(n / 3);
                return;
            }
        }
        
        System.out.println("NIE");
    }
}