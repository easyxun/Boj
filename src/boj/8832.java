import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int K = sc.nextInt();
            
            int result = N * 60 + M;
            result -= K;
            
            int hour = result / 60;
            int minute = result % 60;
            
            System.out.println(hour + " " + minute);
        }
        
        sc.close();
    }
}