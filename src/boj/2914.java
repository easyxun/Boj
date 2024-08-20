import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int songs = sc.nextInt();
        int avg = sc.nextInt();
        
        int result = songs * (avg - 1) + 1;
        
        System.out.println(result);
        
        sc.close();
    }
}