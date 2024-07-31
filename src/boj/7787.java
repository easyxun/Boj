import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String name = sc.next();
        int age = sc.nextInt();
        
        System.out.println(name);
        System.out.println(age);
        
        sc.close();
    }
}