import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n % 2 == 0) {
            System.out.println((n / 2) * (n / 2 + 1));
        } else {
            System.out.println(((n + 1) / 2) * ((n + 1) / 2));
        }
    }
}