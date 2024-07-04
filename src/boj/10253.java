```java
import java.util.Scanner;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            BigInteger A = BigInteger.valueOf(sc.nextInt());
            BigInteger B = BigInteger.valueOf(sc.nextInt());

            while (A.compareTo(BigInteger.ONE) == 1) {
                BigInteger tmp = B.divide(A).add(BigInteger.ONE);
                A = A.multiply(tmp).subtract(B);
                B = B.multiply(tmp);
                BigInteger gcd = A.gcd(B);
                A = A.divide(gcd);
                B = B.divide(gcd);
            }
            System.out.println(B);
        }

        sc.close();
    }
}
```