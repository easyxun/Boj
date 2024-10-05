import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        for (int i = 0; i < T; i++) {
            String str1 = sc.next();
            String str2 = sc.next();
            
            if (str1.length() != str2.length()) {
                System.out.println("No");
            } else {
                boolean isAnagram = true;
                int[] count1 = new int[26];
                int[] count2 = new int[26];
                
                for (int j = 0; j < str1.length(); j++) {
                    count1[str1.charAt(j) - 'a']++;
                    count2[str2.charAt(j) - 'a']++;
                }
                
                for (int k = 0; k < 26; k++) {
                    if (count1[k] != count2[k]) {
                        isAnagram = false;
                        break;
                    }
                }
                
                if (isAnagram) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
    }
}