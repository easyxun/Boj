import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        
        int maxSum = 0;
        int sum = 0;
        int count = 0;
        int left = 0;
        int right = 0;
        
        while (right < N) {
            if (count < M) {
                sum += arr[right];
                count++;
                right++;
            } else {
                maxSum = Math.max(maxSum, sum);
                sum -= arr[left];
                count--;
                left++;
            }
        }
        
        while (count > 0) {
            maxSum = Math.max(maxSum, sum);
            sum -= arr[left];
            count--;
            left++;
        }
        
        System.out.println(maxSum);
    }
}