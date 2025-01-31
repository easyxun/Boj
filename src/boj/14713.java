import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] words = sc.nextLine().split(" ");

        List<String> poem = new ArrayList<>();
        for (String word : words) {
            poem.add(word);
        }

        int n = sc.nextInt();
        sc.nextLine();

        String[] checkWords = sc.nextLine().split(" ");

        int currentIndex = 0;
        for (String checkWord : checkWords) {
            boolean found = false;
            for (int i = currentIndex; i < poem.size(); i++) {
                if (poem.get(i).equals(checkWord)) {
                    currentIndex = i + 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Impossible");
                return;
            }
        }

        System.out.println("Possible");
    }
}