package advanceClass.Queues1;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class Q6_reverseQueueUsingStack {
    static Queue<Integer> reverse(Queue<Integer> input){
        Stack<Integer> stack = new Stack<>();
        while (!input.isEmpty()){
            stack.push(input.poll());
        }
        while(!stack.isEmpty()){
            input.offer(stack.pop());
        }
        return input;
    }
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        for(int i = 0 ; i < 10 ; i++){
            q.offer(i);
        }
        System.out.println(q);
        reverse(q);
        System.out.println(q);

    }
}
