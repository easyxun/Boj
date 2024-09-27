import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int totalMoves = 0;
        
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            
            totalMoves += Math.abs(a - b);
        }
        
        System.out.println(totalMoves);
        
        sc.close();
    }
}