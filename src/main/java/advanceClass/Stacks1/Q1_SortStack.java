package advanceClass.Stacks1;

import java.util.Arrays;
import java.util.Stack;

public class Q1_SortStack {
    static void sortStack(Stack<Integer> st){
        Stack<Integer> helper =new Stack<>();
        while (!st.isEmpty()){
         int x = st.pop();
         while(!helper.isEmpty() && helper.peek()<x){
             int temp = helper.pop();
             st.push(temp);
         }
         helper.push(x);
        }
        while(!helper.isEmpty()){
            st.push(helper.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.addAll(Arrays.asList(-2,5,3,-2,10,7,9,-9,11));
        System.out.println(st);
        sortStack(st);
        System.out.println(st);
    }
}
