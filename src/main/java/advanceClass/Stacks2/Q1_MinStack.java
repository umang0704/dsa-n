package advanceClass.Stacks2;

import java.util.Stack;

public class Q1_MinStack {
    private Stack<Integer> helper = new Stack<>();
    private Integer currentMinimum = -1;

    public Integer getCurrentMinimum() {
        return currentMinimum;
    }

    void push(Integer data) {

        if (helper.isEmpty()) {
            currentMinimum = data;
            helper.push(data);
            return;
        }
        if (!helper.isEmpty() && data <= currentMinimum) {
            helper.push(2 * data - currentMinimum);
            currentMinimum = data;
        } else {
            helper.push(data);
        }
        System.out.println(helper + ", " + currentMinimum);
    }

    Integer pop() {
        if (!helper.isEmpty()) {
            if (helper.peek() <= currentMinimum) {
                Integer originalElement = currentMinimum;
                currentMinimum = 2 * currentMinimum - helper.peek();
                helper.pop();
                return originalElement;
            } else return helper.pop();
        }
        return null;
    }

    Integer top() {
        if (helper.peek() < currentMinimum) return currentMinimum;
        else return helper.peek();
    }

    public static void main(String[] args) {
        Q1_MinStack obj = new Q1_MinStack();
        obj.push(7);
        obj.push(5);
        obj.push(2);
        System.out.println(obj.getCurrentMinimum());
        obj.push(8);
        obj.push(1);
        System.out.println(obj.getCurrentMinimum());
        System.out.println(obj.top());
        System.out.println(obj.pop());
        System.out.println(obj.pop());
        System.out.println(obj.top());
        System.out.println(obj.getCurrentMinimum());

    }
}
