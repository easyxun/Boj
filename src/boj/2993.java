import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        String min = s;
        for (int i = 1; i < s.length(); i++) {
            String newStr = s.substring(i) + s.substring(0, i);
            if (newStr.compareTo(min) < 0) {
                min = newStr;
            }
        }

        System.out.println(min);
    }
}