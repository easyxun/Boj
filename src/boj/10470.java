import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int[] arr = new int[N];
            
            for (int j = 0; j < N; j++) {
                arr[j] = sc.nextInt();
            }
            
            int max = arr[0];
            int min = arr[0];
            for (int j = 1; j < N; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
                if (arr[j] < min) {
                    min = arr[j];
                }
            }
            
            System.out.println(min + " " + max);
        }
        
        sc.close();
    }
}