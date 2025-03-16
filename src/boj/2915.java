```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int result = N;
        while (K > 0) {
            if (K % 2 == 1) {
                result = result * 2 + 1;
            }
            K /= 2;
        }

        System.out.println(result);
    }
}
```