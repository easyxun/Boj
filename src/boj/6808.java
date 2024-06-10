import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] kyu = new int[9];
        int[] in = new int[9];
        boolean[] card = new boolean[19];
        int kyuScore = 0;
        int inScore = 0;

        for (int i = 0; i < 9; i++) {
            kyu[i] = sc.nextInt();
            card[kyu[i]] = true;
        }

        int index = 0;
        for (int i = 1; i <= 18; i++) {
            if (!card[i]) {
                in[index] = i;
                index++;
            }
        }

        do {
            int kyuSum = 0;
            int inSum = 0;

            for (int i = 0; i < 9; i++) {
                if (kyu[i] > in[i]) {
                    kyuSum += kyu[i] + in[i];
                } else {
                    inSum += kyu[i] + in[i];
                }
            }

            if (kyuSum > inSum) {
                kyuScore++;
            } else {
                inScore++;
            }
        } while (next_permutation(in));

        System.out.println(kyuScore + " " + inScore);
    }

    public static boolean next_permutation(int[] arr) {
        int i = arr.length - 1;
        while (i > 0 && arr[i - 1] >= arr[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = arr.length - 1;
        while (arr[j] <= arr[i - 1]) {
            j--;
        }

        int temp = arr[i - 1];
        arr[i - 1] = arr[j];
        arr[j] = temp;

        j = arr.length - 1;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}