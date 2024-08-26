import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int totalDays = 0;
        
        int startMonth = sc.nextInt();
        int startDay = sc.nextInt();
        int endMonth = sc.nextInt();
        int endDay = sc.nextInt();
        
        for (int i = startMonth - 1; i < endMonth - 1; i++) {
            totalDays += days[i];
        }
        
        totalDays = totalDays - startDay + endDay;
        
        System.out.println(totalDays);
        
        sc.close();
    }
}