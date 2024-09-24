import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long S = sc.nextLong();
        
        long sum = 0;
        long n = 0;
        
        while (sum <= S) {
            n++;
            sum += n;
        }
        
        System.out.println(n - 1);
    }
}