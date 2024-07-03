import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] score = new double[4];
        String[] team = new String[4];

        for (int i = 0; i < 4; i++) {
            team[i] = sc.next();
            score[i] = sc.nextDouble();
        }

        double[] total = new double[4];
        total[0] = score[0] + score[1];
        total[1] = score[0] + score[2];
        total[2] = score[0] + score[3];
        total[3] = score[1] + score[2];

        double[] result = new double[4];
        for (int i = 0; i < 4; i++) {
            if (total[i] > total[(i + 1) % 4]) {
                result[i] += 1.0;
            } else if (total[i] < total[(i + 1) % 4]) {
                result[(i + 1) % 4] += 1.0;
            } else {
                result[i] += 0.5;
                result[(i + 1) % 4] += 0.5;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println(result[i]);
        }
    }
}