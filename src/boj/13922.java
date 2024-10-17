import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long result = n * (n - 1) * (n - 2) * (n - 3);
        System.out.println(result);
    }
}