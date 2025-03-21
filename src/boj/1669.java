import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int X = sc.nextInt();
        int Y = sc.nextInt();
        
        int diff = Y - X;
        int days = 0;
        int sum = 0;
        
        while (sum < diff) {
            days++;
            sum += days / 2 + 1;
        }
        
        System.out.println(days);
    }
}