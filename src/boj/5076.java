import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String input = sc.nextLine();

            if (input.equals("#")) {
                break;
            }

            if (input.contains("<") && input.contains(">")) {
                if (isValid(input)) {
                    System.out.println("legal");
                } else {
                    System.out.println("illegal");
                }
            } else {
                System.out.println("illegal");
            }
        }
    }

    public static boolean isValid(String input) {
        int index1 = input.indexOf("<");
        int index2 = input.indexOf(">");

        while (index1 != -1 && index2 != -1) {
            if (index1 > index2) {
                return false;
            }

            input = input.substring(index2 + 1);
            index1 = input.indexOf("<");
            index2 = input.indexOf(">");
        }

        return true;
    }
}