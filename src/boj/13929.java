import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 4 == 0) {
            System.out.println("0 " + n/2);
        } else if (n % 4 == 1) {
            System.out.println("1 " + n/2);
        } else if (n % 4 == 2) {
            System.out.println("1 " + (n/2 + 1));
        } else {
            System.out.println("0 " + (n/2 + 1));
        }
    }
}