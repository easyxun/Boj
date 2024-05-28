import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long result = 0;
        
        while (n > 0) {
            long digit = n % 10;
            result += Math.min(digit, 9 - digit);
            n /= 10;
        }
        
        System.out.println(result);
    }
}