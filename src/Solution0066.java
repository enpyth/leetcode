class Solution0066 {
    public int[] plusOne(int[] digits) {
        int flag = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + flag == 10) {
                flag = 1;
                digits[i] = 0;
            } else {
                digits[i] += flag;
                flag = 0;
            }
        }
        if (flag == 0) {
            return digits;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        for (int i=1; i<res.length; i++) {
            res[i] = digits[i-1];
        }
        return res;
    }
}