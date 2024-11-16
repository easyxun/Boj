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
            
            int count = 0;
            for (int i = 1; i <= n; i++) {
                int sum = i;
                int temp = i;
                
                while (temp > 0) {
                    sum += temp % 10;
                    temp /= 10;
                }
                
                if (sum == n) {
                    count = i;
                    break;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
```