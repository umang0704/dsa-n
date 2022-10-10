package advanceClass.Queues1;

public class Q1_ArrayImpl {
    private Integer[] arr = new Integer[5];
    int f = -1, r = -1;
    Integer capacity = arr.length;
    Integer size = 0;

    void enqueue(int data) {
        if (size == capacity) {
            System.out.println("Memory Overflow");
            return;
        }
        r = (r + 1) % capacity;
        arr[r] = data;
        size++;
    }

    Integer front() {
        if (size == 0) {
            System.out.println("Empty Queue.");
            return null;
        }
        return arr[(f + 1) % capacity];
    }

    Integer dequeue() {
        if (size == 0) {
            System.out.println("Empty Queue.");
            return null;
        }
        int v = arr[(f + 1) % capacity];
        f = (f + 1) % capacity;
        size--;
        return v;
    }

    public static void main(String[] args) {
        Q1_ArrayImpl o = new Q1_ArrayImpl();
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
