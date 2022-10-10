package advanceClass.Queues1;

import advanceClass.LinkedList1.ListNode;
import advanceClass.LinkedList1.Operations;

public class Q2_LLImpl {
    private ListNode head = null;
    private ListNode tail = null;

    Integer size = 0;
    void enqueue(Integer data) {
        if (head == null) {
            head = new ListNode(data);
            tail = head;
            Operations.printLL(head);
            size++;
            return;
        }
        tail.next = new ListNode(data);
        tail = tail.next;
        Operations.printLL(head);
        size++;
    }

    Integer front() {
        if (head == null) return null;
        return head.data;
    }

    Integer dequeue() {
        if (head == null) return null;
        Integer v = head.data;
        head = head.next;
        size--;
        Operations.printLL(head);
        return v;
    }

    public static void main(String[] args) {
        Q2_LLImpl o = new Q2_LLImpl();
        o.enqueue(1);
        o.enqueue(2);
        o.enqueue(3);
        o.enqueue(2);
        o.enqueue(3);
        o.enqueue(3);
        o.enqueue(2);
        o.enqueue(3);
        System.out.println(o.front());
        System.out.println(o.dequeue());
        System.out.println(o.front());
        System.out.println(o.dequeue());
        System.out.println(o.front());
        System.out.println(o.dequeue());
        o.enqueue(3);
        o.enqueue(2);
        System.out.println(o.front());
    }
}
