package Easy;

/**
 * NO.1474
 */
public class DeleteNNodesAfterMNodesOfLinkedList {
    public ListNode deleteNodes(ListNode head, int m, int n) {
        ListNode node = head;
        while (node != null) {
            for (int i = 0; i < m - 1; i++) {
                node = node.next;
                if (node == null) break;
            }

            if (node == null) break;

            for (int i = 0; i < n; i++) {
                if (node.next == null) break;
                node.next = node.next.next;
            }

            node = node.next;
        }
        return head;
    }
}
