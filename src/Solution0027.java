class Solution0027 {
    public int removeElement(int[] nums, int val) {
        int res = 0;
        for (int i=0; i< nums.length; i++) {
            if (nums[i] != val) {
                nums[res] = nums[i];
                res += 1;
            }
        }
        return res;
    }
}