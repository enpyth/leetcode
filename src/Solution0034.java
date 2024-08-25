public class Solution0034 {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = i + (j - i) / 2;
            if (nums[mid] == target) {
                int r = mid;
                while (mid > 0 && nums[mid] == nums[mid - 1]) mid--;
                ans[0] = mid;
                while (r < nums.length - 1 && nums[r] == nums[r + 1]) r++;
                ans[1] = r;
                return ans;
            } else if (nums[mid] < target) i = mid + 1;
            else j = mid - 1;
        }
        return ans;
    }
}
