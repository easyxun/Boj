import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double n = sc.nextDouble();
        double d = sc.nextDouble();
        
        double result = Math.abs(n - d / 2);
        System.out.println(result);
        
        sc.close();
    }
}