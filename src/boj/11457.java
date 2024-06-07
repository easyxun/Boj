import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            int max = 0;

            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
                max = Math.max(max, arr[j]);
            }

            int count = 0;
            for (int j = 0; j < N; j++) {
                if (arr[j] == max) {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}