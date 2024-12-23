```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int count = 0;

        while (n != 0 || m != 0) {
            if (n % 2 == 1 && m % 2 == 0) {
                count++;
            } else if (n % 2 == 0 && m % 2 == 1) {
                count++;
            }

            n = sc.nextInt();
            m = sc.nextInt();
        }

        System.out.println(count);

        sc.close();
    }
}
```