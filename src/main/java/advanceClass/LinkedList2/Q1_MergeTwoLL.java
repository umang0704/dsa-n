package advanceClass.LinkedList2;

import advanceClass.LinkedList1.ListNode;
import advanceClass.LinkedList1.Operations;

public class Q1_MergeTwoLL {
    static void merge1(ListNode head1, ListNode head2){//size of ll1 > ll2

        ListNode temp1 = head1, temp2 = head2;
        while(head2!=null){
            temp2 = head2;
            head2 = head2.next;
            temp2.next = temp1.next;
            temp1.next = temp2;
            temp1 = temp2.next;
        }

    }
    static void merge2(ListNode head1, ListNode head2){//size of ll1 < ll2
        ListNode temp1 = head1, temp2 = head2;
        while(head1!=null){
            temp1 = head1;
            head1 = head1.next;
            temp1.next = temp2.next;
            temp2.next = temp1;
            temp2 = temp1.next;
        }

    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(11);
        head1.next.next.next.next.next = new ListNode(6);

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(52);
        head2.next.next = new ListNode(13);
        head2.next.next.next = new ListNode(42);
        head2.next.next.next.next = new ListNode(1111);
//        head2.next.next.next.next.next = new Node(16);
        Operations.printLL(head1);
        Operations.printLL(head2);
        merge1(head1,head2);
        Operations.printLL(head1);

        head1 = new ListNode(10);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
//        head1.next.next.next.next = new Node(11);
//        head1.next.next.next.next.next = new Node(6);

        head2 = new ListNode(1);
        head2.next = new ListNode(52);
        head2.next.next = new ListNode(13);
        head2.next.next.next = new ListNode(42);
        head2.next.next.next.next = new ListNode(1111);
        head2.next.next.next.next.next = new ListNode(16);

        Operations.printLL(head1);
        Operations.printLL(head2);
        merge2(head1,head2);
        Operations.printLL(head2);
    }
}
