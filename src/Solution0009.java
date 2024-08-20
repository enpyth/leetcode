public class Solution0009 {
    public boolean isPalindrome(int x) {
        String s;
        if (x < 0) {
            x = 0 - x;
            s = x + "-";
        } else {
            s = x + "";
        }
        int left = 0;
        int right = s.length() - 1;
        if (s.length() % 2 != 0) {
            while (left != right) {
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
        } else {
            while (left - 1 != right) {
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
        }
        return true;
    }
}
