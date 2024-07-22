import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int sum = 0;
        
        for (int i = 0; i < N; i++) {
            int time = sc.nextInt();
            sum += time;
        }
        
        int result = sum / M;
        if (sum % M != 0) {
            result++;
        }
        
        System.out.println(result);
    }
}