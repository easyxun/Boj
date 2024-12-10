import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int sum = 0;
            int cnt = 0;
            int start = 0;
            int end = 0;

            int m = sc.nextInt();
            int[] arr = new int[m];

            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
            }

            for (int j = 0; j < m; j++) {
                if (sum + arr[j] >= 0) {
                    sum += arr[j];
                    cnt++;
                    end = j;
                } else {
                    sum = 0;
                    cnt = 0;
                    start = j + 1;
                }
            }

            if (cnt == 0) {
                System.out.println("Losing streak.");
            } else {
                System.out.println("The maximum winning streak is " + sum + ".");
            }
        }

        sc.close();
    }
}