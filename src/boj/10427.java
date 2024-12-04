import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String[] input = sc.nextLine().split(" ");
            long N = Long.parseLong(input[0]);
            long M = Long.parseLong(input[1]);
            long K = Long.parseLong(input[2]);
            
            long result = N + (M - 1) * K;
            System.out.println(result);
        }
        
        sc.close();
    }
}