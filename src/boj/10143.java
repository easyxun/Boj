```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        
        int answer = Math.min(n / 2, Math.min(m, (n + m - k) / 3));
        
        System.out.println(answer);
        
        sc.close();
    }
}
```