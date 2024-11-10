import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }

            boolean[] visited = new boolean[n + 1];
            visited[n] = true;

            while (true) {
                int next = (int) Math.pow(n, 2);
                if (visited[next]) {
                    System.out.println("UNHAPPY");
                    break;
                } else if (next == 1) {
                    System.out.println("HAPPY");
                    break;
                } else {
                    visited[next] = true;
                    n = next;
                }
            }
        }
    }
}