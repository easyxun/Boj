import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] towers = new int[n];
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            towers[i] = sc.nextInt();
        }

        for (int i = n - 1; i >= 0; i--) {
            int max = towers[i];
            for (int j = i + 1; j < n; j++) {
                if (towers[j] > max) {
                    max = towers[j];
                    result[i] = j + 1;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}