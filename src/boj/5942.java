import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[] arr = new long[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        long sum = 0;
        long max = 0;
        
        for (int i = 0; i < n; i++) {
            sum = Math.max(arr[i], sum + arr[i]);
            max = Math.max(max, sum);
        }
        
        System.out.println(max);
        
        sc.close();
    }
}