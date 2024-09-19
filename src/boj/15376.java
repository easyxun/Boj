```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        if (n % m == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

        scanner.close();
    }
}
```