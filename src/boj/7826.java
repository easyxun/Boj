import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 1; i <= T; i++) {
            long n = sc.nextLong();
            long result = (long) Math.ceil(Math.log(n) / Math.log(2));
            System.out.println("Case #" + i + ": " + result);
        }
        
        sc.close();
    }
}