import java.util.HashMap;

class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i=0; i<nums.length; i++) {
            // nums[i] + nums[x] = target
            int idx = target-nums[i];
            if (mp.containsKey(idx) && mp.get(idx) != i) {
                return new int[]{i, mp.get(idx)};
            }
            mp.put(nums[i], i);
        }
        return nums;
    }
}