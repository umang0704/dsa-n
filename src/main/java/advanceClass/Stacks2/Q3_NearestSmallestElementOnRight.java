package advanceClass.Stacks2;

import java.util.Arrays;
import java.util.Stack;

public class Q3_NearestSmallestElementOnRight {
    Integer[] nearestSmallestElementOnRight(Integer[] elements) {
        Stack<Integer> helper = new Stack<>();
        Integer[] nearestSmallestElementArray = new Integer[elements.length];
        for (int i = elements.length-1; i >= 0; i--) {
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
        Q3_NearestSmallestElementOnRight smallestElementOnRight = new Q3_NearestSmallestElementOnRight();
        System.out.println(Arrays.toString(smallestElementOnRight.nearestSmallestElementOnRight(new Integer[]{4, 5, 2, 10, 3, 2})));
        System.out.println(Arrays.toString(smallestElementOnRight.nearestSmallestElementOnRight(new Integer[]{4, 6, 10, 11, 7, 8, 3, 5})));

    }
}
