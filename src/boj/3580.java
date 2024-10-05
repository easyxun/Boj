```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] A = new int[N];
            int[] B = new int[N];

            for (int j = 0; j < N; j++) {
                A[j] = sc.nextInt();
                B[j] = sc.nextInt();
            }

            int result = 0;
            int idx = 0;

            while (idx < N) {
                if (A[idx] > B[idx]) {
                    int diff = A[idx] - B[idx];
                    if (idx + diff < N && A[idx + diff] < B[idx + diff]) {
                        A[idx] -= diff;
                        A[idx + diff] += diff;
                        result++;
                    } else {
                        idx++;
                    }
                } else {
                    idx++;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}
```