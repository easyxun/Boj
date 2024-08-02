import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            String[] words = input.split(" ");

            for (String word : words) {
                if (word.contains("oulupukk")) {
                    System.out.print("Joulupukki");
                } else {
                    System.out.print(word);
                }

                System.out.print(" ");
            }

            System.out.println();
        }

        scanner.close();
    }
}