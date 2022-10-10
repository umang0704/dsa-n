package advanceClass.Stacks2;

import java.util.Arrays;
import java.util.Stack;

public class Q2_NearestSmallestElementOnLeft {

    Integer[] nearestSmallestElementOnLeft(Integer[] elements) {
        Stack<Integer> helper = new Stack<>();
        Integer[] nearestSmallestElementArray = new Integer[elements.length];
        for (int i = 0; i < elements.length; i++) {
            Integer element = elements[i];
            while (!helper.isEmpty() && helper.peek() >= element) {
                helper.pop();
            }
            if (!helper.isEmpty()) nearestSmallestElementArray[i] = helper.peek();
            else nearestSmallestElementArray[i] = null;
            helper.push(element);
        }
        return nearestSmallestElementArray;
    }

    public static void main(String[] args) {
        Q2_NearestSmallestElementOnLeft smallestElementOnLeft = new Q2_NearestSmallestElementOnLeft();
        System.out.println(Arrays.toString(smallestElementOnLeft.nearestSmallestElementOnLeft(new Integer[]{4, 5, 2, 10, 3, 2})));
        System.out.println(Arrays.toString(smallestElementOnLeft.nearestSmallestElementOnLeft(new Integer[]{4, 6, 10, 11, 7, 8, 3, 5})));
    }
}
