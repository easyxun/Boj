import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int result = n + (n-1);
        System.out.println(result);
        
        sc.close();
    }
}