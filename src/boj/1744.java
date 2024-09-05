import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int result = 0;
        
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                positive.add(num);
            } else {
                negative.add(num);
            }
        }
        
        positive.sort(Comparator.reverseOrder());
        negative.sort(Comparator.naturalOrder());
        
        for (int i = 0; i < positive.size(); i += 2) {
            if (i + 1 < positive.size()) {
                result += Math.max(positive.get(i) * positive.get(i + 1), positive.get(i));
            } else {
                result += positive.get(i);
            }
        }
        
        for (int i = 0; i < negative.size(); i += 2) {
            if (i + 1 < negative.size()) {
                result += negative.get(i) * negative.get(i + 1);
            } else {
                result += negative.get(i);
            }
        }
        
        System.out.println(result);
    }
}