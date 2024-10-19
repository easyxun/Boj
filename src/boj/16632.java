import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        if (sum % 2 == 1) {
            System.out.println(sum);
        } else {
            int minDiff = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i != j) {
                        int diff = Math.abs(arr[i] - arr[j]);
                        minDiff = Math.min(minDiff, diff);
                    }
                }
            }
            System.out.println(sum - minDiff);
        }
    }
}