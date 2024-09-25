import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            System.out.println("String #" + (i+1));
            for (int j = 0; j < s.length(); j++) {
                System.out.print(s.charAt(j) + " ");
            }
            System.out.println("\n");
        }
        
        sc.close();
    }
}