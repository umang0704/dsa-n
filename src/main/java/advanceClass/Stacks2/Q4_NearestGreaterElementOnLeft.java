package advanceClass.Stacks2;

import java.util.Arrays;
import java.util.Stack;

public class Q4_NearestGreaterElementOnLeft {

    Integer[] nearestGreaterElementOnLeft(Integer[] elements) {
        Stack<Integer> helper = new Stack<>();
        Integer[] nearestSmallestElementArray = new Integer[elements.length];
        for (int i = 0; i < elements.length; i++) {
            Integer element = elements[i];
            while (!helper.isEmpty() && helper.peek() <= element) {
                helper.pop();
            }
            if (!helper.isEmpty()) nearestSmallestElementArray[i] = helper.peek();
            else nearestSmallestElementArray[i] = null;
            helper.push(element);
        }
        return nearestSmallestElementArray;
    }

    public static void main(String[] args) {
        Q4_NearestGreaterElementOnLeft greaterElementOnLeft = new Q4_NearestGreaterElementOnLeft();
        System.out.println(Arrays.toString(greaterElementOnLeft.nearestGreaterElementOnLeft(new Integer[]{4, 5, 2, 10, 3, 2})));
        System.out.println(Arrays.toString(greaterElementOnLeft.nearestGreaterElementOnLeft(new Integer[]{4, 6, 10, 11, 7, 8, 3, 5})));
    }
}
