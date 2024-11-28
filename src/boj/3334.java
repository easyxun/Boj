import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            String word = sc.nextLine();

            if (word.length() == 1) {
                System.out.println("YES");
            } else if (word.charAt(0) == 'a' && word.charAt(word.length() - 1) == 'a') {
                if (word.substring(1, word.length() - 1).replace("a", "").isEmpty()) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("NO");
            }
        }
    }
}