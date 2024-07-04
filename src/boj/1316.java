import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = sc.next();
            boolean[] visited = new boolean[26];
            boolean groupWord = true;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);

                if (visited[c - 'a']) {
                    groupWord = false;
                    break;
                }

                if (j < word.length() - 1 && c != word.charAt(j + 1)) {
                    visited[c - 'a'] = true;
                }
            }

            if (groupWord) {
                count++;
            }
        }

        System.out.println(count);
    }
}