import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int result = 0;
            
            while (N > 0) {
                if (N % 2 == 0) {
                    N /= 2;
                } else {
                    N = (N - 1) / 2;
                    result++;
                }
            }
            
            System.out.println(result);
        }
        
        sc.close();
    }
}