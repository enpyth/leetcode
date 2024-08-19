public class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode node = ans;
        int flag = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + flag;
            node.next = new ListNode(sum % 10);
            flag = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
            node = node.next;
        }
        while (l1 != null) {
            int sum = l1.val + flag;
            node.next = new ListNode(sum % 10);
            flag = sum / 10;
            l1 = l1.next;
            node = node.next;
        }
        while (l2 != null) {
            int sum = l2.val + flag;
            node.next = new ListNode(sum % 10);
            flag = sum / 10;
            l2 = l2.next;
            node = node.next;
        }
        if (flag == 1) node.next = new ListNode(1);
        return ans.next;
    }
}
