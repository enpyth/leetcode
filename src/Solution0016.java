import java.util.Arrays;

public class Solution0016 {
    public int threeSumClosest(int[] nums, int target) {
        int sum = nums[0] + nums[1] + nums[2];
        int val = Math.abs(target - sum);
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    int sum_i = nums[i] + nums[j] + nums[k];
                    int val_i = Math.abs(target - sum_i);
                    if (val_i < val) {
                        sum = sum_i;
                        val = val_i;
                    }
                }
            }
        }
        return sum;
    }
}
