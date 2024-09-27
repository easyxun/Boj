import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 1;
        
        while(ans * ans < n) {
            ans++;
        }
        
        System.out.println(ans);
    }
}