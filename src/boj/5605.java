import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int[] arr = new int[m];
            int sum = 0;
            for (int j = 0; j < m; j++) {
                arr[j] = sc.nextInt();
                sum += arr[j];
            }
            System.out.println(sum - m + 1);
        }
        
        sc.close();
    }
}