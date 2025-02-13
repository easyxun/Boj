import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int sum = 0;
        int max = 0;
        int min = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            sum += num;
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        
        System.out.println("합계: " + sum);
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);
        
        sc.close();
    }
}