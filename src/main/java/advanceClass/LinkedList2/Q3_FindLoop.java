package advanceClass.LinkedList2;

import advanceClass.LinkedList1.ListNode;

public class Q3_FindLoop {
    static boolean findLoop(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;

    }

    static ListNode findLoopNode(ListNode head){
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) break;
        }
        if(slow!=fast) return null;
        slow = head;
        while (slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        ListNode head1 = new ListNode(10);
        head1.next = new ListNode(5);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(11);
        head1.next.next.next.next.next = head1.next.next.next;
        System.out.println(findLoop(head1));
        System.out.println(findLoopNode(head1).data);
    }
}
