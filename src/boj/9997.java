import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume the newline character
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            boolean hasAllAlphabets = true;
            for (char c = 'a'; c <= 'z'; c++) {
                if (str.indexOf(c) == -1 && str.indexOf(Character.toUpperCase(c)) == -1) {
                    hasAllAlphabets = false;
                    break;
                }
            }
            if (hasAllAlphabets) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}