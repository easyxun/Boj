import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        StringBuilder sb = new StringBuilder();
        String N_str = String.valueOf(N);
        
        for (int i = 0; i < N; i++) {
            sb.append(N_str);
        }
        
        String result = sb.toString();
        
        if (result.length() > M) {
            System.out.println(result.substring(0, M));
        } else {
            System.out.println(result);
        }
    }
}