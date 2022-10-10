package advanceClass.Queues1;

import advanceClass.GCD.Q2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Stack;

public class Q4_NthNoOfPattern {
    Queue<Integer> queue = new ArrayDeque<>();
    void findPattern(Integer n){
        queue = new ArrayDeque<>();
        queue.addAll(Arrays.asList(1,2,3));
        while(n > 0){
            Integer temp = queue.poll();
            System.out.print(temp+", ");
            queue.offer(Integer.parseInt(temp+"1"));
            queue.offer(Integer.parseInt(temp+"2"));
            queue.offer(Integer.parseInt(temp+"3"));
            n--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Q4_NthNoOfPattern o = new Q4_NthNoOfPattern();
        o.findPattern(3);
        o.findPattern(6);
        o.findPattern(11);
    }
}
