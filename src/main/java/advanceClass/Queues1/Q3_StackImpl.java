package advanceClass.Queues1;

import java.util.Stack;

public class Q3_StackImpl {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    Integer size = 0;

    void enqueue(Integer data) {
        stack1.push(data);
        size++;
    }

    Integer front() {
        if(size == 0) return null;
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) stack2.push(stack1.pop());
        }
        return stack2.peek();
    }

    Integer dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) stack2.push(stack1.pop());
        }
        size--;
        return stack2.pop();
    }

    public static void main(String[] args) {
        Q3_StackImpl o = new Q3_StackImpl();
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
