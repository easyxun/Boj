```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            for (int j = 0; j < numStr.length(); j++) {
                char c = numStr.charAt(j);
                if (c == '3' || c == '6' || c == '9') {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
```