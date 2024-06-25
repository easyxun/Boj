import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++) {
            int n = sc.nextInt();
            List<String> ingredients = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                ingredients.add(sc.next());
            }
            
            int m = sc.nextInt();
            List<String> allergens = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                allergens.add(sc.next());
            }
            
            int count = 0;
            for (String ingredient : ingredients) {
                boolean isSafe = true;
                for (String allergen : allergens) {
                    if (ingredient.equals(allergen)) {
                        isSafe = false;
                        break;
                    }
                }
                if (isSafe) {
                    count++;
                }
            }
            
            System.out.println("Case #" + i + ": " + count);
        }
        
        sc.close();
    }
}