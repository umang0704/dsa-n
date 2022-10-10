package advanceClass.Queues1;

import java.util.ArrayDeque;
import java.util.Queue;

public class Q5_NthPerfectNo {
    void NthPerfectNumber(Integer n){
        Queue<String> q = new ArrayDeque<>();
        q.offer("1");
        q.offer("2");
        while (n > 0) {
            StringBuilder ts = new StringBuilder(q.poll());
            System.out.print(ts.toString()+ts.reverse().toString()+",");
            ts.append("1");
            q.offer(ts.toString());
            ts.deleteCharAt(ts.lastIndexOf("1"));
            ts.append("2");
            q.offer(ts.toString());
            n--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Q5_NthPerfectNo o = new Q5_NthPerfectNo();
        o.NthPerfectNumber(3);
        o.NthPerfectNumber(5);
        o.NthPerfectNumber(7);
        o.NthPerfectNumber(9);
    }
}
