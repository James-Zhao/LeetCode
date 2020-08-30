package Easy;

/**
 * Created by zhaosi on 17-6-21.
 * NO.21
 */
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        if (l1.val >= l2.val) {
            ListNode tmp = l2.next;
            l2.next = mergeTwoLists(l1, tmp);
            return l2;
        } else {
            ListNode tmp = l1.next;
            l1.next = mergeTwoLists(l2, tmp);
            return l1;
        }
    }
}
