package Easy;

/**
 * NO.141
 */
public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slower = head;
        ListNode faster = head;
        while(faster.next != null && faster.next.next != null) {
            //if there is a circle, there must be slower==faster, so the loop will end
            slower = slower.next;
            faster = faster.next.next;
            if (slower == faster) return true;
        }
        return false;
    }
}
