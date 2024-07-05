import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a = n - m;
        int b = n / 2 + 1;
        
        System.out.println(a + " " + b);
    }
}