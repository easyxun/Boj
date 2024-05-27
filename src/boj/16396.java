import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[10001];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            for (int j = x; j < y; j++) {
                arr[j] = 1;
            }
        }

        int count = 0;
        for (int i = 0; i < 10001; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }

        System.out.println(count);
    }
}