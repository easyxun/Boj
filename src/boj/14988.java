import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a == 1 && b == 2 && c == 3) {
            System.out.println("ascending");
        } else if (a == 3 && b == 2 && c == 1) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
        
        sc.close();
    }
}