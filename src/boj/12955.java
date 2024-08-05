```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = 1;

        for (long i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println(result);
    }
}
```