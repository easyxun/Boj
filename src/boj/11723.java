import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int bitMask = 0;

        for (int i = 0; i < m; i++) {
            String input = sc.next();
            int x;

            switch (input) {
                case "add":
                    x = sc.nextInt();
                    bitMask |= (1 << x);
                    break;
                case "remove":
                    x = sc.nextInt();
                    bitMask &= ~(1 << x);
                    break;
                case "check":
                    x = sc.nextInt();
                    int result = (bitMask & (1 << x)) > 0 ? 1 : 0;
                    System.out.println(result);
                    break;
                case "toggle":
                    x = sc.nextInt();
                    bitMask ^= (1 << x);
                    break;
                case "all":
                    bitMask = (1 << 21) - 1;
                    break;
                case "empty":
                    bitMask = 0;
                    break;
            }
        }

        sc.close();
    }
}