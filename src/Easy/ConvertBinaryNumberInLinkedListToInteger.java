package Easy;

/**
 * NO.1290
 */
public class ConvertBinaryNumberInLinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        ListNode node = head;
        int ans = 0;
        while (node != null) {
            ans = ans * 2 + node.val;
            node = node.next;
        }
        return ans;
    }
}
