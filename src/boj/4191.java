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
            
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    count++;
                } else {
                    count--;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}
```