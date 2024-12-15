import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            
            long result = (n + m) / 2;
            System.out.println(result);
        }
        
        sc.close();
    }
}