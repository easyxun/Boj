```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;

            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += i * i;
            }

            int count = 0;
            for (int i = 1; i <= n; i++) {
                count += i;
            }

            int guess = 0;
            for (int i = 1; i <= n; i++) {
                guess += i * count;
            }

            System.out.println(sum + " " + guess + " " + (guess - sum));
        }

        sc.close();
    }
}
```