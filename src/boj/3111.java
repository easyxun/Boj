import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String T = sc.next();

        StringBuilder sb = new StringBuilder();
        StringBuilder reversed = new StringBuilder();

        int start = 0;
        int end = T.length() - 1;

        while (start <= end) {
            sb.append(T.charAt(start));
            reversed.insert(0, T.charAt(end));
            
            if (reversed.length() >= A.length() && sb.toString().endsWith(A) && reversed.toString().startsWith(A)) {
                sb.setLength(sb.length() - A.length());
                reversed.delete(0, A.length());
            }

            start++;
            end--;
        }

        sb.append(reversed);

        System.out.println(sb.toString());
    }
}