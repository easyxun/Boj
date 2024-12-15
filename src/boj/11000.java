import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] end = new int[n];
        
        for (int i = 0; i < n; i++) {
            start[i] = sc.nextInt();
            end[i] = sc.nextInt();
        }
        
        Arrays.sort(start);
        Arrays.sort(end);
        
        int rooms = 0;
        int endIdx = 0;
        
        for (int i = 0; i < n; i++) {
            if (start[i] < end[endIdx]) {
                rooms++;
            } else {
                endIdx++;
            }
        }
        
        System.out.println(rooms);
        
        sc.close();
    }
}