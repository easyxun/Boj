import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String input = sc.nextLine();
            if (input.equals("0")) {
                break;
            }
            
            int length = input.length();
            int count = 1;
            
            for (int i = 0; i < length; i++) {
                char c = input.charAt(i);
                if (c == ' ')
                    count++;
            }
            
            System.out.println(count);
        }
        
        sc.close();
    }
}