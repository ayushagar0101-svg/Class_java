import java.util.*;
//using stack to find the next greater element for each element in nums2 and then mapping the results to nums1

class Next_GreaterElement_leetcode496 {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[nums1.length];
        int arr[] = new int[nums2.length];
        for (int i = nums2.length - 1; i >= 0; i--) {

            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                arr[i] = -1;
            } else {
                arr[i] = st.peek();
            }

            st.push(nums2[i]);
        }

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    ans[i] = arr[j];
                    break;
                }
            }
        }

        return ans;
    }
}