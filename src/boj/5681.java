```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            
            int sum = 0;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    sum += i;
                }
            }
            
            if (sum == n) {
                System.out.println(n + " perfect");
            } else if (Math.abs(sum - n) <= 2) {
                System.out.println(n + " almost perfect");
            } else {
                System.out.println(n + " not perfect");
            }
        }
        
        sc.close();
    }
}
```