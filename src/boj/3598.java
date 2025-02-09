import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int t = 0; t < T; t++) {
            String[] input = sc.nextLine().split(" ");
            int N = Integer.parseInt(input[0]);
            int M = Integer.parseInt(input[1]);
            int K = Integer.parseInt(input[2]);
            
            int max = Math.max(N, Math.max(M, K));
            int min = Math.min(N, Math.min(M, K));
            
            int result = max - min;
            
            System.out.println(result);
        }
        
        sc.close();
    }
}