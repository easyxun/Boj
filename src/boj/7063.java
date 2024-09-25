```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            String str = sc.next();

            for (int j = 0; j < str.length(); j++) {
                char ch = str.charAt(j);
                if (Character.isDigit(ch)) {
                    sum += Character.getNumericValue(ch);
                }
            }

            System.out.println(sum);
        }

        sc.close();
    }
}
```