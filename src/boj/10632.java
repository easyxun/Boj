```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int result = (a * b) + (b * c) + (c * a) - (a + b + c) * 2 + 1;

        System.out.println(result);

        sc.close();
    }
}
```