import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            String original = input.replaceAll(" ", "");
            String translated = original.equals("") ? "����?" : original;

            System.out.println(translated);
        }

        sc.close();
    }
}