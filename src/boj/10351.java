import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String[] time = sc.nextLine().split(":");
            int hour = Integer.parseInt(time[0]);
            int minute = Integer.parseInt(time[1]);
            
            int totalMinutes = hour * 60 + minute;
            int remainingMinutes = 1440 - totalMinutes;
            
            int newHour = remainingMinutes / 60;
            int newMinute = remainingMinutes % 60;
            
            System.out.println(String.format("%02d:%02d", newHour, newMinute));
        }
        
        sc.close();
    }
}