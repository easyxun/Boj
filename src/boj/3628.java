import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        
        for (int i = 0; i < n; i++) {
            String str = sc.nextLine();
            
            if (str.matches("R[0-9]+C[0-9]+")) {
                String[] parts = str.split("R|C");
                int row = Integer.parseInt(parts[1]);
                int col = Integer.parseInt(parts[2]);
                
                StringBuilder result = new StringBuilder();
                while (col > 0) {
                    if (col % 26 == 0) {
                        result.insert(0, 'Z');
                        col = col / 26 - 1;
                    } else {
                        result.insert(0, (char)('A' + (col - 1) % 26));
                        col /= 26;
                    }
                }
                
                System.out.println(result.toString() + row);
            } else {
                int idx = 0;
                while (Character.isAlphabetic(str.charAt(idx))) {
                    idx++;
                }
                
                int col = 0;
                for (int j = 0; j < idx; j++) {
                    col = col * 26 + (str.charAt(j) - 'A' + 1);
                }
                
                System.out.println("R" + str.substring(idx) + "C" + col);
            }
        }
        
        sc.close();
    }
}