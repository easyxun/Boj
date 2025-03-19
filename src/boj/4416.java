import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (Character.isLowerCase(c)) {
                    sb.append(Character.toUpperCase(c));
                } else if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(c);
                }
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}