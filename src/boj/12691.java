import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        while (T-- > 0) {
            int D = sc.nextInt();
            int L = sc.nextInt();
            
            double time = (double) D / L;
            double avgSpeed = 1 / time;
            
            System.out.println(String.format("%.2f", avgSpeed));
        }
        
        sc.close();
    }
}