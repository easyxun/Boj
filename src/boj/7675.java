import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            String[] words = sc.nextLine().split(" ");
            int count = 0;

            for (String word : words) {
                if (word.matches("[A-Z][a-z]*[.!?]?")) {
                    count++;
                }
            }

            System.out.println("Data Set " + i + ":");
            System.out.println(count);
        }
    }
}