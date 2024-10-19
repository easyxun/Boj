import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        int N = sc.nextInt();
        
        int result = T * (N + 1);
        
        System.out.println(result);
        
        sc.close();
    }
}