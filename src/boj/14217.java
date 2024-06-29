import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.nextLine();
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String query = sc.nextLine();
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (names[j].contains(query)) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}