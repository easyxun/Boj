```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int result = 0;
        for (int i = 0; i <= n; i++) {
            int tmp = i;
            for (int j = 0; j < k; j++) {
                tmp = tmp % 10 == 0 ? tmp / 10 : tmp - 1;
            }
            result += tmp;
        }
        
        System.out.println(result);
        
        sc.close();
    }
}
```