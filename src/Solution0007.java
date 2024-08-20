public class Solution0007 {
    public int reverse(int x) {
        int num = x;
        int ans = 0;
        while (num != 0) {

            int r = num % 10;
            if (ans > Integer.MAX_VALUE / 10 || ans < Integer.MIN_VALUE / 10) return 0;
            ans = ans * 10 + r;
            num = num / 10;
        }
        return ans;
    }
}

