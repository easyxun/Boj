import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }

            Arrays.sort(arr);

            int count = 0;
            int prev = arr[0];

            for (int j = 1; j < N; j++) {
                if (arr[j] != prev) {
                    count++;
                }
                prev = arr[j];
            }

            System.out.println(count + 1);
        }
    }
}