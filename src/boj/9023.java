import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            long N = sc.nextLong();
            long M = sc.nextLong();
            
            long result = (N * (N + 1) / 2) * (M * (M + 1) / 2);
            System.out.println(result);
        }
        
        sc.close();
    }
}