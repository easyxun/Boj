import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                sum += (prices[i + 1] - prices[i]);
            }
        }

        System.out.println(sum);
    }
}