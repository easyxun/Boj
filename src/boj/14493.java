import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int count = 0;
        int prev = sc.nextInt();
        
        for (int i = 1; i < n; i++) {
            int current = sc.nextInt();
            if (prev > current) {
                count++;
            }
            prev = current;
        }
        
        System.out.println(count);
    }
}