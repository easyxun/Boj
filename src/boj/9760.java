```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for (int i = 0; i < T; i++) {
            String[] cards = new String[5];
            for (int j = 0; j < 5; j++) {
                cards[j] = sc.next();
            }

            if (isRoyalFlush(cards)) {
                System.out.println("Yes");
            } else if (isStraightFlush(cards)) {
                System.out.println("Yes");
            } else if (isFourOfAKind(cards)) {
                System.out.println("Yes");
            } else if (isFullHouse(cards)) {
                System.out.println("Yes");
            } else if (isFlush(cards)) {
                System.out.println("Yes");
            } else if (isStraight(cards)) {
                System.out.println("Yes");
            } else if (isThreeOfAKind(cards)) {
                System.out.println("Yes");
            } else if (isTwoPairs(cards)) {
                System.out.println("Yes");
            } else if (isOnePair(cards)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    public static boolean isRoyalFlush(String[] cards) {
        // Implement the logic for Royal Flush
    }

    public static boolean isStraightFlush(String[] cards) {
        // Implement the logic for Straight Flush
    }

    public static boolean isFourOfAKind(String[] cards) {
        // Implement the logic for Four of a Kind
    }

    public static boolean isFullHouse(String[] cards) {
        // Implement the logic for Full House
    }

    public static boolean isFlush(String[] cards) {
        // Implement the logic for Flush
    }

    public static boolean isStraight(String[] cards) {
        // Implement the logic for Straight
    }

    public static boolean isThreeOfAKind(String[] cards) {
        // Implement the logic for Three of a Kind
    }

    public static boolean isTwoPairs(String[] cards) {
        // Implement the logic for Two Pairs
    }

    public static boolean isOnePair(String[] cards) {
        // Implement the logic for One Pair
    }
}
```