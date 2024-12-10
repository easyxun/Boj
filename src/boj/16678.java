import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = 0;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > i + 1) {
                max += arr[i] - (i + 1);
            } else if (arr[i] < i + 1) {
                min += (i + 1) - arr[i];
            }
        }

        if (max >= min) {
            System.out.println(max);
        } else {
            System.out.println(min);
        }

        sc.close();
    }
}