```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int n = sc.nextInt();
            int b = sc.nextInt();
            if (n == 0 && b == 0) {
                break;
            }
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += arr[i];
            }
            
            int max = 0;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }
            
            int result = (sum + b) / n;
            if (result < max) {
                result = max;
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}
```