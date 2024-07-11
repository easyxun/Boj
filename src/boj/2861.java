import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int currentSong = sc.nextInt();
        int operation = sc.nextInt();

        int result = currentSong;

        for (int i = 0; i < operation; i++) {
            int change = sc.nextInt();
            if (change == 1) {
                result = (result << 1) % 1024;
            } else {
                result = (result >> 1);
                if (result < 1) {
                    result += 512;
                }
            }
        }

        System.out.println(result);
    }
}