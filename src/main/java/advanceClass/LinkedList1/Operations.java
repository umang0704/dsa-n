package advanceClass.LinkedList1;

public class Operations {
    public static ListNode insertAtBeg(int data, ListNode head) {
        if (head == null) {
            head = new ListNode(data);
            return head;
        }
        ListNode newListNode = new ListNode(data);
        newListNode.next = head;
        head = newListNode;
        return head;
    }

    public static ListNode insertAtEnd(int data, ListNode head) {
        if (head == null) {
            head = new ListNode(data);
            return head;
        }
        ListNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new ListNode(data);
        return head;
    }

    public static ListNode insertAtPosition(int data, int k, ListNode head) {
        ListNode temp = head;
        k--;
        while (temp != null && k > 1) {
            k--;
            temp = temp.next;
        }
        if (k == 1 && temp != null) {
            ListNode newListNode = new ListNode(data);
            newListNode.next = temp.next;
            temp.next = newListNode;
        }
        return head;
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.print("X\n");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(11);
        head.next.next.next.next.next = new ListNode(6);

        printLL(head);
        head = insertAtBeg(3, head);
        printLL(head);
        head = insertAtPosition(99,4,head);
        printLL(head);
    }
}
