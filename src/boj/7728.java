import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        while(n > 0) {
            int num = sc.nextInt();
            int count = 0;
            
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            
            System.out.println(num + " " + count);
            
            n--;
        }
        
        sc.close();
    }
}