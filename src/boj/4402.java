import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= n; i++) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            
            System.out.print("Case #" + i + ": ");
            for (String word : words) {
                System.out.print(word.substring(0, 1).toUpperCase() + word.substring(1) + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}