package Easy;

/**
 * Created by zhaosi on 17-7-2.
 * NO.206
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode nextNode = head.next;
        ListNode newHead = reverseList(nextNode);
        head.next = null;
        nextNode.next = head;

        return newHead;
    }
}
