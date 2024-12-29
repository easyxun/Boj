import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long count = 0;
        for (int i = 1; i <= 64; i++) {
            if ((n & (1L << (i - 1))) != 0) {
                count++;
            }
        }
        
        System.out.println((1L << count) - 1);
    }
}