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
        
        int max = 0;
        for (int i = 0; i < n; i++) {
            int temp = sum - arr[i];
            if (temp % 7 == 0 && temp > max) {
                max = temp;
            }
        }
        
        System.out.println(max);
    }
}