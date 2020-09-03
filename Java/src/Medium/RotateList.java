package Medium;

/**
 * Created by zhaosi on 17-6-24.
 * NO.61
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) return null;
        if (k == 0) return head;
        int count = 1;
        ListNode node1 = head;
        while (node1.next != null) {
            node1 = node1.next;
            count++;
        }
        if (count == 1) return head;
        node1.next = head;//construct a circle

        k = k % count;
        k = count - k;
        ListNode node2 = head;
        while (k > 1) {
            node2 = node2.next;
            k--;
        }
        ListNode result = node2.next;
        node2.next = null;
        return result;
    }
}
