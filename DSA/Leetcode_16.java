package DSA;
import java.util.*;
public class Leetcode_16 {
    public static void main(int[] nums, int target) {
        Arrays.sort(nums);

        int best = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < nums.length - 2; i++) {

            int first = i + 1;
            int last = nums.length - 1;

            while (first < last) {

                int sum = nums[i] + nums[first] + nums[last];

                if (Math.abs(sum - target) < Math.abs(best - target)) {
                    best = sum;
                }

                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    last--;
                } else {
                    first++;
                }
            }
        }

        return best; 
}
}