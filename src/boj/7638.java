import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}