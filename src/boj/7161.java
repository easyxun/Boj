```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        
        int sum = 0;
        for (int i = 0; i < n.length(); i++) {
            sum += Character.getNumericValue(n.charAt(i));
        }
        
        System.out.println(sum);
    }
}
```