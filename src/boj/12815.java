import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] power = new int[n];
        
        for (int i = 0; i < n; i++) {
            power[i] = sc.nextInt();
        }
        
        int m = sc.nextInt();
        int[] opponent = new int[m];
        
        for (int i = 0; i < m; i++) {
            opponent[i] = sc.nextInt();
        }
        
        Arrays.sort(power);
        
        for (int i = 0; i < m; i++) {
            int maxPower = -1;
            int maxIndex = -1;
            
            for (int j = 0; j < n; j++) {
                if (opponent[i] >= power[j]) {
                    if (power[j] > maxPower) {
                        maxPower = power[j];
                        maxIndex = j;
                    }
                }
            }
            
            if (maxIndex != -1) {
                power[maxIndex] = 0;
            }
        }
        
        int sum = 0;
        for (int p : power) {
            sum += p;
        }
        
        System.out.println(sum);
    }
}