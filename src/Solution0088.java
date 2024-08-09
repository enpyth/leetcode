public class Solution0088 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1; i >= 0; i--) {
            if (m == 0) {
                nums1[i] = nums2[n-1];
                n -= 1;
            } else if (n == 0) {
                nums1[i] = nums1[m-1];
                m -= 1;
            } else if (nums1[m - 1] < nums2[n - 1]) {
                nums1[i] = nums2[n - 1];
                n -= 1;
                System.out.println("m:" + m + "n:" + n + "\n");
            } else {
                nums1[i] = nums1[m - 1];
                m -= 1;
                System.out.println("m:" + m + "n:" + n + "\n");
            }
        }
    }
}


/*
Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
*/
