import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");

            for (int i = 0; i < words.length; i++) {
                if (i % 2 == 0) {
                    System.out.print(words[i].toLowerCase() + " ");
                } else {
                    System.out.print(words[i].toUpperCase() + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}