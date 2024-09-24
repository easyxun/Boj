import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        
        int count = 0;
        while (m >= n) {
            m--;
            s--;
            count++;
        }
        
        System.out.println(count);
        
        sc.close();
    }
}