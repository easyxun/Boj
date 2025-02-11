import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }

            int count = 0;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    count++;
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}