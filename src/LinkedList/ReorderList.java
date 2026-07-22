package LinkedList;

public class ReorderList {
    public void reorderList(ListNode head) {
        ListNode h = head;
        ListNode slow = h;
        ListNode fast = h;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode forward = slow.next;
        // Let Reverse it
        ListNode curr = forward;
        ListNode prev = null;
        while(curr!=null){
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        slow.next = null;
        ListNode t1 = h;
        ListNode t2 = prev;
        while(t1!=null && t2!=null){
            ListNode n = t1.next;
            t1.next = t2;
            ListNode nn = t2.next;
            t2.next = n;
            t1 = n;
            t2 = nn;
        }
    }
}
