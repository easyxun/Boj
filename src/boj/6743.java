import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int weight1 = sc.nextInt();
        int weight2 = sc.nextInt();
        
        int diff = weight2 - weight1;
        int target = weight2 + diff;
        
        System.out.println(target);
        
        sc.close();
    }
}