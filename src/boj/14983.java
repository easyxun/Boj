import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        
        int result = 0;
        for (int i = 0; i < K; i++) {
            result += N * M;
        }
        
        System.out.println(result);
    }
}