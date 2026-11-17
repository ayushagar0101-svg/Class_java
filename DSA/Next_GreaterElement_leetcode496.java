package DSA;
// using broute force to find the next greater element for each element in the array
public class Next_GreaterElement_leetcode496 {
        public static void main(String[] args) {
        int arr[] = {4, 5, 2, 10, 8};
        int n = arr.length;
        int brr[] = new int[n];
        for (int i = 0; i < n; i++) {
            brr[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    brr[i] = arr[j];
                    break;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(brr[i]);
        }
    }
}
