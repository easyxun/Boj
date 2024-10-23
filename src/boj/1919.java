import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String str1 = sc.next();
        String str2 = sc.next();
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (int i = 0; i < str1.length(); i++) {
            count1[str1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < str2.length(); i++) {
            count2[str2.charAt(i) - 'a']++;
        }
        
        int result = 0;
        
        for (int i = 0; i < 26; i++) {
            result += Math.abs(count1[i] - count2[i]);
        }
        
        System.out.println(result);
    }
}