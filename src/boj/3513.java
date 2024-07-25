import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numStudents = sc.nextInt();
            int[] scores = new int[numStudents];
            for (int j = 0; j < numStudents; j++) {
                scores[j] = sc.nextInt();
            }
            Arrays.sort(scores);
            System.out.println("Class " + (i+1));
            System.out.println("Max " + scores[numStudents-1] + ", Min " + scores[0] + ", Largest gap " + (scores[numStudents-1] - scores[0]));
        }
    }
}