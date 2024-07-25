import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] words = new String[n];
        
        for (int i = 0; i < n; i++) {
            words[i] = sc.next();
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            String word = words[i];
            boolean isPrefix = false;
            for (int j = 0; j < n; j++) {
                if (i != j && words[j].startsWith(word)) {
                    isPrefix = true;
                    break;
                }
            }
            if (!isPrefix) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}