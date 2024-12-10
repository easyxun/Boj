import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = sc.nextInt();
        
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        
        int result = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                result = i + 1;
                break;
            }
        }
        
        System.out.println(result);
    }
}