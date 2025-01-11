import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        sc.nextLine();
        
        for (int i = 1; i <= t; i++) {
            String s = sc.nextLine();
            StringBuilder sb = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (Character.isUpperCase(c)) {
                    sb.append(Character.toLowerCase(c));
                } else {
                    sb.append(Character.toUpperCase(c));
                }
            }
            
            System.out.println("Data Set " + i + ": " + sb.toString());
        }
        
        sc.close();
    }
}