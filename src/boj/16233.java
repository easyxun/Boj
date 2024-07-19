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
        
        int avg = sum / n;
        
        int answer = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > avg) {
                answer += arr[i] - avg;
            }
        }
        
        System.out.println(answer);
    }
}