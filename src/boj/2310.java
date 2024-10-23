import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            String roomType = sc.next();

            if (roomType.equals("#")) {
                break;
            }

            int totalIncome = 0;

            while (true) {
                String action = sc.next();

                if (action.equals("0")) {
                    break;
                }

                int amount = sc.nextInt();

                if (action.equals("S")) {
                    totalIncome += amount;
                } else if (action.equals("L")) {
                    totalIncome -= amount;
                }
            }

            System.out.println(roomType + " " + totalIncome);
        }

        sc.close();
    }
}