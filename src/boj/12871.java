```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.next();
        String t = sc.next();
        
        int sLen = s.length();
        int tLen = t.length();
        
        int lcm = sLen * tLen / gcd(sLen, tLen);
        
        String newS = s;
        String newT = t;
        
        while (newS.length() < lcm) {
            newS += s;
        }
        
        while (newT.length() < lcm) {
            newT += t;
        }
        
        if (newS.equals(newT)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
    
    public static int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}
```