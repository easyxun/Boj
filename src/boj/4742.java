import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();
            if (input.equals("END")) {
                break;
            }

            StringBuilder reversed = new StringBuilder();
            for (int i = input.length() - 1; i >= 0; i--) {
                reversed.append(input.charAt(i));
            }

            System.out.println(reversed.toString());
        }

        sc.close();
    }
}