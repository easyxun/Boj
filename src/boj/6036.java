```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        int count = 0;
        for (int i = 0; i < m; i++) {
            String letter = sc.next();
            for (String word : words) {
                if (word.contains(letter)) {
                    count++;
                }
            }
        }
        
        System.out.println(count);
    }
}
```