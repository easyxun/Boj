```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            int D = sc.nextInt();
            int L = sc.nextInt();
            int N = sc.nextInt();
            
            int totalDistance = D * N;
            int totalTime = totalDistance / (L + L);
            
            System.out.println("Case " + i + ": " + totalTime);
        }
        
        sc.close();
    }
}
```