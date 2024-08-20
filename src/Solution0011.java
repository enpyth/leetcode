public class Solution0011 {
    public int maxArea(int[] height) {
        int ans = 0;
        int i = 0;
        int j = height.length - 1;
        while (i != j) {
            ans = Math.max(ans, (j - i) * Math.min(height[i], height[j]));
            if (height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
}
