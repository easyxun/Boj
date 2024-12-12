import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            if (word.contains("a") || word.contains("e") || word.contains("i") || word.contains("o") || word.contains("u")) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}