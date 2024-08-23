import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long[] soldiers = new long[(int)N];
        
        for (int i = 0; i < N; i++) {
            soldiers[i] = sc.nextLong();
        }
        
        long minPower = 1;
        long maxPower = (long)1e9;
        
        while (minPower < maxPower) {
            long midPower = (minPower + maxPower) / 2;
            long totalPower = 0;
            
            for (int i = 0; i < N; i++) {
                if (soldiers[i] < midPower) {
                    totalPower += midPower - soldiers[i];
                }
            }
            
            if (totalPower <= (long)1e9) {
                minPower = midPower + 1;
            } else {
                maxPower = midPower;
            }
        }
        
        System.out.println(minPower - 1);
    }
}