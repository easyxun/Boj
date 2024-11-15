import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while (n != 0) {
            int sum = 0;
            int count = 0;
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i < n; i++) {
                int num = sc.nextInt();
                sum += num;
                count++;
                
                if (num > max) {
                    max = num;
                }
                
                if (num < min) {
                    min = num;
                }
            }
            
            double avg = (double) sum / count;
            
            System.out.println("최대값: " + max);
            System.out.println("최소값: " + min);
            System.out.println("평균값: " + String.format("%.2f", avg));
            
            n = sc.nextInt();
        }
        
        sc.close();
    }
}