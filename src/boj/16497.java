import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        
        for (char c : str1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : str2.toCharArray()) {
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }
        
        int count = 0;
        for (char key : map1.keySet()) {
            if (map1.get(key) > map2.getOrDefault(key, 0)) {
                count += map1.get(key) - map2.getOrDefault(key, 0);
            }
        }
        
        System.out.println(count <= n ? "YES" : "NO");
    }
}