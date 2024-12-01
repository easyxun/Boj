import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long k = sc.nextLong();
        
        long result = 0;
        
        if (n % k == 0) {
            result = n / k;
        } else {
            result = n / k + 1;
        }
        
        System.out.println(result);
    }
}