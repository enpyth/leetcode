import java.util.HashSet;

class Solution0003 {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int left = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hs.contains(s.charAt(i))) {
                hs.add(s.charAt(i));
                ans = Math.max(ans, i - left + 1);
            } else {
                while (hs.contains(s.charAt(i))) {
                    hs.remove(s.charAt(left));
                    left += 1;
                }
                hs.add(s.charAt(i));
            }
        }

        return ans;
    }
}