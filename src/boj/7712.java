import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            
            System.out.println("Data set " + (i+1) + ":");
            if (s1.equals(s2)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
        
        sc.close();
    }
}