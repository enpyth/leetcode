import java.util.*;

public class Solution0018 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        Set<List<Integer>> ans = new HashSet<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length - 3; i++) {
            for (int j = i + 1; j < nums.length - 2; j++) {
                int l = j + 1;
                int r = nums.length - 1;
                while (l < r) {
                    long sum = (long) nums[i] + nums[j] + nums[l] + nums[r];
                    if (sum == target) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                    } else if (sum < target) l++;
                    else r--;
                }
            }
        }
        res.addAll(ans);
        return res;
    }
}


