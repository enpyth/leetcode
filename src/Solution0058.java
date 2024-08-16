class Solution0058 {
    public int lengthOfLastWord(String s) {
        int j = s.length() - 1;
        int ans = 0;
        while (s.charAt(j) == ' ') {
            j--;
        }
        for (int i = j; i >= 0; i--) {
            if (s.charAt(i) == ' ') break;
            ans++;
        }
        return ans;
    }
}