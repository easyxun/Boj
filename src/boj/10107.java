import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = new int[1000];
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        
        if (sum % 2 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}