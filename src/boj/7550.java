import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            int[] count = new int[1001];

            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
                count[arr[j]]++;
            }

            int max = 0;
            for (int j = 0; j < count.length; j++) {
                if (count[j] > max) {
                    max = count[j];
                }
            }

            System.out.println(max);
        }
    }
}