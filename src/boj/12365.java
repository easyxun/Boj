```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int P = sc.nextInt();
            int M = sc.nextInt();
            int N = sc.nextInt();
            
            int result = P + (M * N);
            System.out.println("Data Set " + i + ": " + result);
        }
        
        sc.close();
    }
}
```