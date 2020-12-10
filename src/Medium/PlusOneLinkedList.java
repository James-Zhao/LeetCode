package Medium;

/**
 * NO.369
 * 官方题解
 */
public class PlusOneLinkedList {
    public ListNode plusOne(ListNode head) {
        ListNode sentienl = new ListNode(0);
        sentienl.next = head;
        ListNode notNine = sentienl;

        while (head != null) {
            if (head.val != 9) notNine = head;
            head = head.next;
        }

        notNine.val++;
        notNine = notNine.next;

        while (notNine != null) {
            notNine.val = 0;
            notNine = notNine.next;
        }
        return sentienl.val != 0? sentienl: sentienl.next;
    }
}
