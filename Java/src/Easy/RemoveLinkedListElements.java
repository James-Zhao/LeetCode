package Easy;

/**
 * Created by zhaosi on 17-6-24.
 */
public class RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode node = head;
        while (node.next != null) {
            if (node.next.val == val) {
                node.next = node.next.next;
            } else {
                node = node.next;
            }
        }
        if (head.val == val) head = head.next;
        return head;
    }
}
