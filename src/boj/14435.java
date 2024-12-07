import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int max = 0;
        int count = 0;
        
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            int num = sc.nextInt();
            if (num == arr[count]) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }
        
        System.out.println(max);
    }
}