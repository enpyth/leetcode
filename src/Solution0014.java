import java.util.Arrays;

class Solution0014 {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String res = "";
        int len = strs.length-1;
        for (int i = 0; i < strs[0].length(); i++) {
            if (strs[0].charAt(i) == strs[len].charAt(i)) {
                res += strs[0].charAt(i);
            } else {
                return res;
            }
        }
        return res;
    }
}