public class Solution0067 {
    public String addBinary(String a, String b) {
        String ans = "";
        int i = a.length() - 1;
        int j = b.length() - 1;
        int flag = 0;
        while (i >= 0 || j >= 0 || flag > 0) {
            if (i >= 0) flag += a.charAt(i--) - '0';
            if (j >= 0) flag += b.charAt(j--) - '0';
            ans = flag % 2 + ans;
            flag = flag / 2;
        }
        return ans;
    }
}