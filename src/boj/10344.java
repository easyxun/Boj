import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int[] nums = new int[5];
            for (int i = 0; i < 5; i++) {
                nums[i] = sc.nextInt();
            }

            if (Arrays.stream(nums).allMatch(num -> num == 0)) {
                break;
            }

            Arrays.sort(nums);

            boolean isPossible = false;
            do {
                if (check(nums, 0, nums[0])) {
                    isPossible = true;
                    break;
                }
            } while (nextPermutation(nums));

            System.out.println(isPossible ? "Possible" : "Impossible");
        }
    }

    public static boolean check(int[] nums, int idx, int target) {
        if (idx == nums.length) {
            return target == 23;
        }

        return check(nums, idx + 1, target + nums[idx])
                || check(nums, idx + 1, target - nums[idx])
                || check(nums, idx + 1, target * nums[idx]);
    }

    public static boolean nextPermutation(int[] nums) {
        int i = nums.length - 1;
        while (i > 0 && nums[i - 1] >= nums[i]) {
            i--;
        }

        if (i <= 0) {
            return false;
        }

        int j = nums.length - 1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }

        int temp = nums[i - 1];
        nums[i - 1] = nums[j];
        nums[j] = temp;

        j = nums.length - 1;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }

        return true;
    }
}