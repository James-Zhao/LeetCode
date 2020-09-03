package Medium;

/**
 * Created by zhaosi on 17-6-22.
 * NO.19
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode h1=head, h2=head;
        while(n>0) {
            h2=h2.next;
            n--;
        }
        if(h2 == null)return head.next;
        h2=h2.next;

        while(h2!=null){
            h1=h1.next;
            h2=h2.next;
        }
        h1.next=h1.next.next;
        return head;
    }
}
