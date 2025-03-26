import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] words = str.split(" ");
            StringBuilder sb = new StringBuilder();
            
            for (String word : words) {
                char[] chars = word.toCharArray();
                for (int i = 0; i < chars.length; i++) {
                    if (i == 0 || chars[i-1] == ' ') {
                        sb.append(Character.toUpperCase(chars[i]));
                    } else {
                        sb.append(chars[i]);
                    }
                }
                sb.append(" ");
            }
            
            System.out.println(sb.toString().trim());
        }
    }
}