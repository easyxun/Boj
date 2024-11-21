```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("#")) {
                break;
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c >= 'a' && c <= 'z') {
                    sb.append((char) ('a' + ('z' - c)));
                } else if (c >= 'A' && c <= 'Z') {
                    sb.append((char) ('A' + ('Z' - c)));
                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb.toString());
        }

        sc.close();
    }
}
```