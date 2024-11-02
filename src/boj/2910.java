import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = sc.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (!map.containsKey(num)) {
                map.put(num, 1);
                list.add(num);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }

        Collections.sort(list, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return list.indexOf(a) - list.indexOf(b);
            }
            return map.get(b) - map.get(a);
        });

        for (int num : list) {
            int freq = map.get(num);
            for (int i = 0; i < freq; i++) {
                System.out.print(num + " ");
            }
        }
    }
}