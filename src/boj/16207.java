import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] count = new int[26];
        for (int i = 0; i < 5; i++) {
            String str = sc.next();
            for (int j = 0; j < str.length(); j++) {
                count[str.charAt(j) - 'A']++;
            }
        }
        
        int max = 0;
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] > max) {
                max = count[i];
            }
            sum += count[i];
        }
        
        if (max >= 10 && sum - max >= 10) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}