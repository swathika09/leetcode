import java.util.*;

class two_sum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        two_sum sol = new two_sum();

        int[] nums = new int[sc.nextInt()];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[] result = sol.twoSum(nums, target);

        System.out.println(Arrays.toString(result));
    }
}