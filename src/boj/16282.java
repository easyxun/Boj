import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        
        long ans = 1;
        long cur = 1;
        long sum = 1;
        
        while (sum < n) {
            cur++;
            sum += cur * (cur + 1) / 2;
            ans++;
        }
        
        System.out.println(ans);
    }
}