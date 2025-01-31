```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == x) {
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
        
        sc.close();
    }
}
```