import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, c, d;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();
            
            if (a == 0 && b == 0 && c == 0 && d == 0) {
                break;
            }
            
            int answer = -1;
            for (int i = 0; i <= 1000; i++) {
                if (a * i * i + b * i + c == d) {
                    answer = i;
                    break;
                }
            }
            
            System.out.println(answer);
        }
        
        sc.close();
    }
}