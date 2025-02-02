import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long result = 1;

        for (int i = 0; i < n; i++) {
            result = (result * 2) % 1000000007;
        }

        System.out.println(result);
    }
}