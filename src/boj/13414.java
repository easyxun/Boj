import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        int k = sc.nextInt();
        int l = sc.nextInt();

        for (int i = 0; i < l; i++) {
            String student = sc.next();
            map.put(student, i);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            k--;
            if (k == 0) {
                break;
            }
        }
    }
}