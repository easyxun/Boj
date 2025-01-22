import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] fibo = new int[45];
        fibo[0] = 1;
        fibo[1] = 1;
        
        for (int i = 2; i < 45; i++) {
            fibo[i] = fibo[i-1] + fibo[i-2];
        }
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            int count = 0;
            for (int j = 44; j >= 0; j--) {
                if (num >= fibo[j]) {
                    num -= fibo[j];
                    count++;
                }
            }
            System.out.println(count);
        }
        
        sc.close();
    }
}