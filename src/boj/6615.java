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

            boolean[] isPrime = new boolean[2 * n + 1];
            for (int i = 2; i <= 2 * n; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= 2 * n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            int count = 0;
            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}
```