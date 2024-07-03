import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        long sum = n * n;
        long oddSum = n * (n - 1) + 1;
        
        System.out.println(sum + " " + oddSum);
        
        sc.close();
    }
}