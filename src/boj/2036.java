import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> positive = new ArrayList<>();
        List<Integer> negative = new ArrayList<>();
        int zeroCount = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > 0) {
                positive.add(num);
            } else if (num < 0) {
                negative.add(num);
            } else {
                zeroCount++;
            }
        }

        Collections.sort(positive, Collections.reverseOrder());
        Collections.sort(negative);

        for (int i = 0; i < positive.size() - 1; i += 2) {
            result += positive.get(i) * positive.get(i + 1);
        }

        if (positive.size() % 2 == 1) {
            result += positive.get(positive.size() - 1);
        }

        for (int i = 0; i < negative.size() - 1; i += 2) {
            result += negative.get(i) * negative.get(i + 1);
        }

        if (negative.size() % 2 == 1) {
            if (zeroCount == 0) {
                result += negative.get(negative.size() - 1);
            }
        }

        System.out.println(result);
    }
}