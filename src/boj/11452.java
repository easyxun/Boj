import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            String result = "";
            
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (c == 'i' || c == 'I') {
                    result += "1";
                } else if (c == 'z' || c == 'Z') {
                    result += "2";
                } else if (c == 'e' || c == 'E') {
                    result += "3";
                } else if (c == 'a' || c == 'A') {
                    result += "4";
                } else if (c == 's' || c == 'S') {
                    result += "5";
                } else if (c == 'g' || c == 'G') {
                    result += "6";
                } else if (c == 't' || c == 'T') {
                    result += "7";
                } else if (c == 'b' || c == 'B') {
                    result += "8";
                } else if (c == 'q' || c == 'Q') {
                    result += "9";
                } else {
                    result += c;
                }
            }
            
            System.out.println(result);
        }
    }
}