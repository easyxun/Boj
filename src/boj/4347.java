import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            int count = 1;
            
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) != str.charAt(j-1)) {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}