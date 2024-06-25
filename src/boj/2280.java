import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        while (n != 0 && m != 0) {
            int result = 0;
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                for (int j = 0; j < m; j++) {
                    if (str.charAt(j) == '*') {
                        result++;
                    }
                }
            }
            System.out.println(result);
            
            n = sc.nextInt();
            m = sc.nextInt();
        }
        
        sc.close();
    }
}