package advanceClass.Stacks2;

import java.util.Arrays;
import java.util.Stack;

public class Q5_NearestGreaterElementOnRight {
    Integer[] nearestGreaterElementOnRight(Integer[] elements) {
        Stack<Integer> helper = new Stack<>();
        Integer[] nearestSmallestElementArray = new Integer[elements.length];
        for (int i = elements.length-1; i >= 0; i--) {
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
        Q5_NearestGreaterElementOnRight greaterElementOnRight = new Q5_NearestGreaterElementOnRight();
        System.out.println(Arrays.toString(greaterElementOnRight.nearestGreaterElementOnRight(new Integer[]{4, 5, 2, 10, 3, 2})));
        System.out.println(Arrays.toString(greaterElementOnRight.nearestGreaterElementOnRight(new Integer[]{4, 6, 10, 11, 7, 8, 3, 5})));

    }
}
