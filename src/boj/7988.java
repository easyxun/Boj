import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();
        List<String> firstColumn = new ArrayList<>();
        List<String> secondColumn = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            String first = input[0];
            String second = input[1];

            if (!map.containsKey(first)) {
                map.put(first, map.size());
            }
            firstColumn.add(first);

            if (!map.containsKey(second)) {
                map.put(second, map.size());
            }
            secondColumn.add(second);
        }

        boolean possible = true;

        for (int i = 0; i < n; i++) {
            if (firstColumn.get(i).equals(secondColumn.get(i))) {
                possible = false;
                break;
            }
        }

        System.out.println(possible ? "Yes" : "No");
    }
}