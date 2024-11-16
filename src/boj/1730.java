import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        sc.nextLine();
        
        int x = 0;
        int y = 0;
        
        for (int i = 0; i < n; i++) {
            String[] command = sc.nextLine().split(" ");
            switch (command[0]) {
                case "U":
                    for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                        x--;
                        if (x < 0) x = 0;
                        board[x][y] = 1;
                    }
                    break;
                case "D":
                    for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                        x++;
                        if (x >= n) x = n - 1;
                        board[x][y] = 1;
                    }
                    break;
                case "L":
                    for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                        y--;
                        if (y < 0) y = 0;
                        board[x][y] = 1;
                    }
                    break;
                case "R":
                    for (int j = 0; j < Integer.parseInt(command[1]); j++) {
                        y++;
                        if (y >= n) y = n - 1;
                        board[x][y] = 1;
                    }
                    break;
            }
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] == 1 ? "*" : ".");
            }
            System.out.println();
        }
    }
}