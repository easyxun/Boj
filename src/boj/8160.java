import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n == 1) {
            System.out.println("0");
        } else if (n == 2) {
            System.out.println("1");
        } else {
            System.out.println((n-1)*(n-2)/2);
        }
        
        sc.close();
    }
}