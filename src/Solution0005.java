public class Solution0005 {
    public static String longestPalindrome(String s) {
        if (s.length() < 2) return s;
        String ans = s.substring(0, 1);
        for (int i = 0; i < s.length(); i++) {
            String str1 = getStr(s, i, i);
            String str2 = getStr(s, i, i + 1);
            if (str1.length() > ans.length()) ans = str1;
            if (str2.length() > ans.length()) ans = str2;
        }
        return ans;
    }

    public static String getStr(String s, int n1, int n2) {
        String ans = "";
        while (n1 >= 0 && n2 < s.length() && s.charAt(n1) == s.charAt(n2)) {
            ans = s.substring(n1, n2 + 1);
            n1--;
            n2++;
        }
        return ans;
    }
}
