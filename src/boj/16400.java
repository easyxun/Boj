import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        boolean[] prime = new boolean[40001];
        prime[1] = true;
        
        for (int i = 2; i <= 200; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= 40000; j += i) {
                    prime[j] = true;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i <= n; i += 2) {
            if (!prime[i]) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}