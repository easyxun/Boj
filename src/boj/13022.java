import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.nextLine();
        int[] count = new int[4];
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'w') {
                count[0]++;
            } else if (word.charAt(i) == 'o') {
                count[1]++;
            } else if (word.charAt(i) == 'l') {
                count[2]++;
            } else if (word.charAt(i) == 'f') {
                count[3]++;
            }
        }
        
        if (count[0] == count[1] && count[1] == count[2] && count[2] == count[3]) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}