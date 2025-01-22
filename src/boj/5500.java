import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < T; i++) {
            String str = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            }
            
            System.out.println(sb.toString());
        }
        
        sc.close();
    }
}