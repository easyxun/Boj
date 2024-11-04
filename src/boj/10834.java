```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long direction = 1;
        long speed = 1;

        for (int i = 0; i < n; i++) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            speed = speed * b / a;
            if (c == 1) {
                direction = -direction;
            }
        }

        System.out.println(direction + " " + speed);
    }
}
```