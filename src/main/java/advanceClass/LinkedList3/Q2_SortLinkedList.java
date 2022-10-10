package advanceClass.LinkedList3;

import advanceClass.LinkedList1.ListNode;
import advanceClass.LinkedList1.Operations;

public class Q2_SortLinkedList {
    static ListNode mergeSorted(ListNode head1, ListNode head2) {
        ListNode dummyListNode = null;
        if(head1 == null) return head2;
        if(head2 == null) return head1;
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
    static ListNode middle(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    static ListNode sort(ListNode head){
       if(head == null || head.next==null) return head;
       ListNode middle = middle(head);
       ListNode head2 = middle.next;
       middle.next = null;
       if(head!=null && head.next!=null) sort(head);
       if(head2!=null && head2.next!=null) sort(head2);
       if(head==null && head2!=null) return head2;
       else if(head2==null && head!=null) return head;
       else if(head==null && head2==null) return null;
       else {
           ListNode res = mergeSorted(head,head2);
           Operations.printLL(res);
           return res;}
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next = new ListNode(6);
        Operations.printLL(head);
        System.out.println(sort(head));
    }
}
