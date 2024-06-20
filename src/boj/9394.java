import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            
            int count = 0;
            for (int j = 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if ((j * j + k * k + m) % (j * k) == 0) {
                        count++;
                    }
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}