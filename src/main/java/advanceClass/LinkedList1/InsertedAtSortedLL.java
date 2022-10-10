package advanceClass.LinkedList1;

public class InsertedAtSortedLL {
    public static ListNode insertInSortedLL(int data, ListNode head) {
        ListNode temp = head;
        if (temp == null) return new ListNode(data);
        if (temp.data >= data) {
            ListNode newListNode = new ListNode(data);
            newListNode.next = head;
            head = newListNode;
            return head;
        }
        while (temp.next != null && temp.next.data <= data) {
            temp = temp.next;
        }
        ListNode newListNode = new ListNode(data);
        newListNode.next = temp.next;
        temp.next = newListNode;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(10);
        head.next.next.next.next.next = new ListNode(16);

        Operations.printLL(head);
        head = insertInSortedLL(0, head);
        Operations.printLL(head);
        head = insertInSortedLL(15, head);
        Operations.printLL(head);
        head = insertInSortedLL(10, head);
        Operations.printLL(head);
        head = insertInSortedLL(17, head);
        Operations.printLL(head);
    }
}
