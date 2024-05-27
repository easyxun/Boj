import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            long n = sc.nextLong();
            long result = 1;
            
            for (int i = 0; i < 64; i++) {
                if ((n & (1L << i)) != 0) {
                    System.out.print(result + " ");
                }
                result *= 2;
            }
            System.out.println();
        }
        
        sc.close();
    }
}