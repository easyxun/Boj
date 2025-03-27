import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            char[] chars = input.toCharArray();

            for (char c : chars) {
                if (c == ' ') {
                    System.out.print(" ");
                } else {
                    System.out.print((char) (c - 7));
                }
            }
            System.out.println();
        }

        sc.close();
    }
}