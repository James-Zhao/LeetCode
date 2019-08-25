package Medium;

/**
 * Created by zhaosi on 17-6-19.
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        while (l1 != null || l2 != null || carry != 0) {
            if (l1 != null) {
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                carry += l2.val;
                l2 = l2.next;
            }
            prev.next = new ListNode(carry % 10);
            carry /= 10;
            prev = prev.next;
        }
        return head.next;
    }
}
