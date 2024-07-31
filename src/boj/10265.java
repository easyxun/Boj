import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] groupSize = new int[n];
        for (int i = 0; i < n; i++) {
            groupSize[i] = sc.nextInt();
        }

        int[] dp = new int[k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = k; j >= groupSize[i]; j--) {
                dp[j] = Math.max(dp[j], dp[j - groupSize[i]] + groupSize[i]);
            }
        }

        int maxPeople = 0;
        for (int i = 0; i <= k; i++) {
            maxPeople = Math.max(maxPeople, dp[i]);
        }

        System.out.println(maxPeople + " " + countGroup(dp, groupSize, maxPeople));
    }

    public static int countGroup(int[] dp, int[] groupSize, int maxPeople) {
        int count = 0;
        int currPeople = maxPeople;
        for (int i = dp.length - 1; i >= 0; i--) {
            if (currPeople <= 0) {
                break;
            }
            if (dp[i] == currPeople) {
                count++;
                currPeople -= groupSize[i];
            }
        }
        return count;
    }
}