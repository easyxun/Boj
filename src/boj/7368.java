import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        sc.nextLine();

        for (int t = 0; t < T; t++) {
            String str = sc.nextLine();
            String result = "";

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) {
                    result += Character.toLowerCase(c);
                } else if (Character.isLowerCase(c)) {
                    result += Character.toUpperCase(c);
                } else {
                    result += c;
                }
            }

            System.out.println(result);
        }

        sc.close();
    }
}