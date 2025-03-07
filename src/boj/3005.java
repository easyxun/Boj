import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] puzzle = new char[R][C];
        for (int i = 0; i < R; i++) {
            puzzle[i] = sc.next().toCharArray();
        }

        String result = solve(puzzle, R, C);
        System.out.println(result);

        sc.close();
    }

    public static String solve(char[][] puzzle, int R, int C) {
        String minWord = "";
        boolean found = false;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (puzzle[i][j] != '#') {
                    StringBuilder word = new StringBuilder();
                    int x = i;
                    int y = j;

                    while (y < C && puzzle[x][y] != '#') {
                        word.append(puzzle[x][y]);
                        y++;
                    }

                    if (word.length() > 1 && (minWord.equals("") || word.toString().compareTo(minWord) < 0)) {
                        minWord = word.toString();
                        found = true;
                    }

                    word = new StringBuilder();
                    x = i;
                    y = j;

                    while (x < R && puzzle[x][y] != '#') {
                        word.append(puzzle[x][y]);
                        x++;
                    }

                    if (word.length() > 1 && (minWord.equals("") || word.toString().compareTo(minWord) < 0)) {
                        minWord = word.toString();
                        found = true;
                    }
                }
            }
        }

        if (found) {
            return minWord;
        } else {
            return "No word found";
        }
    }
}