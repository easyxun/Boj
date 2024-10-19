import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] ability = new int[11][11];
        boolean[] visited = new boolean[11];
        int maxAbility = 0;

        int testCase = sc.nextInt();

        for (int t = 0; t < testCase; t++) {
            for (int i = 0; i < 11; i++) {
                for (int j = 0; j < 11; j++) {
                    ability[i][j] = sc.nextInt();
                }
            }

            maxAbility = 0;
            dfs(ability, visited, 0, 0, 0);

            System.out.println(maxAbility);
        }
    }

    public static void dfs(int[][] ability, boolean[] visited, int player, int sum, int depth) {
        if (depth == 11) {
            maxAbility = Math.max(maxAbility, sum);
            return;
        }

        for (int i = 0; i < 11; i++) {
            if (!visited[i] && ability[player][i] != 0) {
                visited[i] = true;
                dfs(ability, visited, player + 1, sum + ability[player][i], depth + 1);
                visited[i] = false;
            }
        }
    }
}