package DSA;

public class Remove_duplicate_leetocde_26 {
     public int removeDuplicates(int[] nums) {

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
}
