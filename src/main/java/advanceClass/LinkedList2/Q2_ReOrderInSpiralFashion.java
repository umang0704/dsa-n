package advanceClass.LinkedList2;

import advanceClass.LinkedList1.ListNode;
import advanceClass.LinkedList1.Operations;

public class Q2_ReOrderInSpiralFashion {
    static ListNode reOrder(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        long lengthSlow = 1l, lengthFast = 1l;
        while (fast != null && fast.next != null) {
            lengthSlow++;
            lengthFast += 2;
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head2 = slow.next;
        slow.next = null;
        lengthFast = lengthFast - lengthSlow;
//        Operations.printLL(head);
//        Operations.printLL(head2);
        if(!(head2 == null || head2.next == null)){
            ListNode c = head2;
            ListNode p = null, cn = null;
            while(c!=null){
                cn = c.next;
                c.next = p;
                p = c;
                c = cn;
            }
            head2  = p;
        }
//        Operations.printLL(head2);
        if (lengthFast > lengthSlow) {
            ListNode t1 = head, t2 = head2;
            while (head != null) {
                t1 = head;
                head = head.next;
                t1.next = t2.next;
                t2.next = t1;
                t2 = t1.next;
            }
            return head2;
        } else {
            ListNode t1 = head, t2 = head2;
            while (head2 != null) {
                t2 = head2;
                head2 = head2.next;
                t2.next = t1.next;
                t1.next = t2;
                t1 = t2.next;
            }
            return head;
        }

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(11);
        head1.next.next.next.next.next = new ListNode(6);
        Operations.printLL(head1);
        head1 = reOrder(head1);
        Operations.printLL(head1);
    }
}
