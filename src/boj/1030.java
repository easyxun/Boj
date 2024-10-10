import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        
        for (long i = A; i < A + Math.pow(B, K); i++) {
            if (i % C == 0) {
                System.out.println(i);
            }
        }
        
        sc.close();
    }
}