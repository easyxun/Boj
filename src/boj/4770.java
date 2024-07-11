import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }
            
            StringBuilder sb = new StringBuilder();
            for (char c : input.toCharArray()) {
                sb.append((char) ('Z' - (c - 'A')));
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}