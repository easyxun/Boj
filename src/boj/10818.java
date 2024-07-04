import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        System.out.println(min + " " + max);
        
        sc.close();
    }
}