import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String str = sc.nextLine();
        String reverseStr = new StringBuilder(str).reverse().toString();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != reverseStr.charAt(i)) {
                count++;
            }
        }
        
        System.out.println(count);
        
        sc.close();
    }
}