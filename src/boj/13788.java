import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        double avg = (double) sum / n;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                count++;
            }
        }

        System.out.println(count);
    }
}