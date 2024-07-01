import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int energy = sc.nextInt();
        int distance = sc.nextInt();
        
        int remainingEnergy = energy - (distance * 2);
        
        if (remainingEnergy < 0) {
            System.out.println(energy);
        } else {
            System.out.println(remainingEnergy);
        }
        
        sc.close();
    }
}