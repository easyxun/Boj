```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] cups = {1, 0, 0};

        String moves = sc.next();
        for (int i = 0; i < moves.length(); i++) {
            char move = moves.charAt(i);
            if (move == 'A') {
                int temp = cups[0];
                cups[0] = cups[1];
                cups[1] = temp;
            } else if (move == 'B') {
                int temp = cups[1];
                cups[1] = cups[2];
                cups[2] = temp;
            } else {
                int temp = cups[0];
                cups[0] = cups[2];
                cups[2] = temp;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (cups[i] == 1) {
                System.out.println(i + 1);
                break;
            }
        }
    }
}
```