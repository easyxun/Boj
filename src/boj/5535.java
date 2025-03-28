import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int temperature = sc.nextInt();
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().split(" ");
            int change = Integer.parseInt(input[0]);
            String unit = input[1];
            
            if (unit.equals("C")) {
                temperature += change;
            } else {
                temperature += change * 9 / 5 + 32;
            }
        }
        
        System.out.println(temperature);
        
        sc.close();
    }
}