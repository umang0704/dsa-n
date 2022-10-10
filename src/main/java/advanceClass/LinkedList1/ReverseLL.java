package advanceClass.LinkedList1;

public class ReverseLL {
    static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        if (head.next.next == null) {
            ListNode p = head;
            ListNode c = head.next;
            c.next = p;
            p = c;
            head = c;
            return head;
        }
        ListNode p = head;
        ListNode c = head.next;
        ListNode cn = head.next.next;
        while (c != null) {
            c.next = p;
            p = c;
            c = cn;
            if (cn != null)
                cn = cn.next;
        }
        head.next = null;
        head = p;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next = new ListNode(6);
        Operations.printLL(head);
        head = reverse(head);
        Operations.printLL(head);
    }
}
