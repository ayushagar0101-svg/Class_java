package DSA;

public class Two_Sum_Leetcode_1 {
        public int[] twoSum(int[] nums, int target) {
        int n;
        int m;
       for(int i = 0; i < nums.length;i++){
         for(int j = i+1; j<nums.length;j++){
            if(nums[i]+nums[j]==target){
              return new int[]{i,j};
            }
         }
       }
       return new int[]{};
        }
}
