package advanceClass.LinkedList3;

import advanceClass.LinkedList1.ListNode;

import static advanceClass.LinkedList1.Operations.printLL;

public class Q1_Merge2SortedLL {
    static ListNode mergeSorted(ListNode head1, ListNode head2) {
        ListNode dummyListNode = null;
        if (head1.data < head2.data) {
            dummyListNode = head1;
            head1 = head1.next;
        } else {
            dummyListNode = head2;
            head2 = head2.next;
        }
        ListNode tail = dummyListNode;
        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                tail.next = head1;
                head1 = head1.next;
            } else {
                tail.next = head2;
                head2 = head2.next;
            }
            tail = tail.next;
        }
        return dummyListNode;

    }

    public static void main(String[] args) {
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(3);
        head1.next.next = new ListNode(4);
        head1.next.next.next = new ListNode(7);
        head1.next.next.next.next = new ListNode(9);
        head1.next.next.next.next.next = new ListNode(11);

        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(6);
        head2.next.next.next = new ListNode(8);
        head2.next.next.next.next = new ListNode(10);
        head2.next.next.next.next.next = new ListNode(12);

        printLL(head1);
        printLL(head2);
        printLL(mergeSorted(head1, head2));
    }
}
