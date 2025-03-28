import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            int sum = 0;
            
            for (int j = 0; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
            
            System.out.println(sum);
        }
        
        sc.close();
    }
}