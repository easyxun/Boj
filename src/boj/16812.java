```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int result = (N % 2 == 0) ? (N * M / 2) : ((N * M + 1) / 2);
        
        System.out.println(result);
        
        sc.close();
    }
}
```