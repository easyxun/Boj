import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s1 = sc.next();
        String s2 = sc.next();
        
        int[] count1 = new int[26];
        int[] count2 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i) - 'a']++;
        }
        
        for (int i = 0; i < s2.length(); i++) {
            count2[s2.charAt(i) - 'a']++;
        }
        
        boolean isAnagram = true;
        for (int i = 0; i < 26; i++) {
            if (count1[i] != count2[i]) {
                isAnagram = false;
                break;
            }
        }
        
        if (isAnagram) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        sc.close();
    }
}