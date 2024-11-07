import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'B') {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }
        
        maxCount = Math.max(maxCount, count);
        
        System.out.println(maxCount);
    }
}