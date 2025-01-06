import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] tokens = line.split(" ");
            String[] currentTime = tokens[0].split(":");
            String[] duration = tokens[1].split(":");
            
            int currentHour = Integer.parseInt(currentTime[0]);
            int currentMinute = Integer.parseInt(currentTime[1]);
            int currentSecond = Integer.parseInt(currentTime[2]);
            
            int durationHour = Integer.parseInt(duration[0]);
            int durationMinute = Integer.parseInt(duration[1]);
            int durationSecond = Integer.parseInt(duration[2]);
            
            int totalCurrentSeconds = currentHour * 3600 + currentMinute * 60 + currentSecond;
            int totalDurationSeconds = durationHour * 3600 + durationMinute * 60 + durationSecond;
            
            int remainingSeconds = totalDurationSeconds - totalCurrentSeconds;
            
            if (remainingSeconds < 0) {
                remainingSeconds += 24 * 3600;
            }
            
            int remainingHour = remainingSeconds / 3600;
            int remainingMinute = (remainingSeconds % 3600) / 60;
            int remainingSecond = remainingSeconds % 60;
            
            System.out.println(String.format("%02d:%02d:%02d", remainingHour, remainingMinute, remainingSecond));
        }
        
        sc.close();
    }
}