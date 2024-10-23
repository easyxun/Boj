import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            int count = 0;
            for (int j = 0; j < str1.length(); j++) {
                if (str1.charAt(j) != str2.charAt(j)) {
                    count++;
                }
            }
            
            System.out.println("Hamming distance is " + count + ".");
        }
        
        sc.close();
    }
}