import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        long n = sc.nextLong();
        
        if (n == 0) {
            System.out.println("0");
        } else if (n > 0) {
            System.out.println("1");
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
}