import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String num = sc.next();
            int len = num.length();
            long count = 0;
            
            for (int i = 1; i < len; i++) {
                count += Math.pow(2, i);
            }
            
            count += Long.parseLong(num, 2) + 1;
            
            System.out.println(count);
        }
        
        sc.close();
    }
}