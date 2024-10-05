import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int n = input.length();

        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            list.add(input.charAt(i));
        }

        ListIterator<Character> iter = list.listIterator(n);

        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String command = sc.next();

            if (command.equals("L")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                }
            } else if (command.equals("D")) {
                if (iter.hasNext()) {
                    iter.next();
                }
            } else if (command.equals("B")) {
                if (iter.hasPrevious()) {
                    iter.previous();
                    iter.remove();
                }
            } else if (command.equals("P")) {
                char c = sc.next().charAt(0);
                iter.add(c);
            }
        }

        for (char c : list) {
            System.out.print(c);
        }
    }
}