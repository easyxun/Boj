import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            String line = sc.nextLine();
            String[] words = line.split(" ");
            StringBuilder result = new StringBuilder();
            
            for (String word : words) {
                if (word.length() == 4) {
                    result.append("**** ");
                } else {
                    result.append(word + " ");
                }
            }
            
            System.out.println(result.toString().trim());
        }
        
        sc.close();
    }
}