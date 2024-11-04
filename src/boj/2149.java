import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] dna = new String[n];
        for (int i = 0; i < n; i++) {
            dna[i] = sc.nextLine();
        }
        Arrays.sort(dna, (a, b) -> {
            int cntA = 0, cntB = 0;
            for (int i = 0; i < a.length(); i++) {
                if (a.charAt(i) == 'A') {
                    cntA++;
                }
                if (b.charAt(i) == 'A') {
                    cntB++;
                }
            }
            if (cntA == cntB) {
                return a.compareTo(b);
            }
            return Integer.compare(cntA, cntB);
        });
        for (String s : dna) {
            System.out.println(s);
        }
    }
}