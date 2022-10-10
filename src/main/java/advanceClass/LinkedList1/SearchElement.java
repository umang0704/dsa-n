package advanceClass.LinkedList1;

public class SearchElement {
    public boolean searchElement(int data, ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == data) return true;
            temp = temp.next;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(10);
        head.next = new ListNode(5);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(11);
        head.next.next .next.next.next= new ListNode(6);

        System.out.println(new SearchElement().searchElement(6,head));

    }
}
