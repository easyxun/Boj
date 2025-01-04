import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String original = input;
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != reversed.charAt(i)) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}