package advanceClass.Stacks2;

import java.util.Arrays;
import java.util.Stack;

public class Q6_LargestRectangleByContiguousHistogram {
    Integer[] nearestSmallestRightIndex(Integer[] elements) {
        Stack<Integer> helperStack = new Stack<>();
        Integer[] answer = new Integer[elements.length];
        for (int i = elements.length-1; i >= 0; i--) {
            Integer element = elements[i];
            while (!helperStack.isEmpty() && elements[helperStack.peek()] >= element) helperStack.pop();
            if (helperStack.isEmpty()) answer[i] = elements.length;
            else answer[i] = helperStack.peek();
            helperStack.push(i);
        }
        return answer;
    }

    Integer[] nearestLargestRightIndex(Integer[] elements) {
        Stack<Integer> helperStack = new Stack<>();
        Integer[] answer = new Integer[elements.length];
        for (int i = elements.length-1; i >= 0; i--) {
            Integer element = elements[i];
            while (!helperStack.isEmpty() && elements[helperStack.peek()] >= element) helperStack.pop();
            if (helperStack.isEmpty()) answer[i] = -1;
            else answer[i] = helperStack.peek();
            helperStack.push(i);
        }
        return answer;
    }

    Integer[] nearestSmallestLeftIndex(Integer[] elements) {
        Stack<Integer> helperStack = new Stack<>();
        Integer[] answer = new Integer[elements.length];
        for (int i = 0; i < elements.length; i++) {
            Integer element = elements[i];
            while (!helperStack.isEmpty() && elements[helperStack.peek()] >= element) helperStack.pop();
            if (helperStack.isEmpty()) answer[i] = -1;
            else answer[i] = helperStack.peek();
            helperStack.push(i);
        }
        return answer;
    }

    Integer[] nearestLargestLeftIndex(Integer[] elements) {
        Stack<Integer> helperStack = new Stack<>();
        Integer[] answer = new Integer[elements.length];
        for (int i = 0; i < elements.length; i++) {
            Integer element = elements[i];
            while (!helperStack.isEmpty() && elements[helperStack.peek()] <= element) helperStack.pop();
            if (helperStack.isEmpty()) answer[i] = -1;
            else answer[i] = helperStack.peek();
            helperStack.push(i);
        }
        return answer;
    }

    Integer largestRectangleArea(Integer[] elements) {
        Integer[] rightSmallest = nearestSmallestRightIndex(elements);
        Integer[] rightLargest = nearestLargestRightIndex(elements);
        Integer[] leftSmallest = nearestSmallestLeftIndex(elements);
        Integer[] leftLargest = nearestLargestLeftIndex(elements);
        System.out.println(Arrays.toString(leftSmallest));
        System.out.println(Arrays.toString(rightSmallest));
        Integer maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < elements.length; i++) {
            int leftLargestIndex = leftSmallest[i];
            int rightLargestIndex = rightSmallest[i];
            int height = elements[i];
            int width = rightLargestIndex -leftLargestIndex -1 ;
            Integer currentArea = height * width;
            System.out.print(currentArea+", ");
            maxArea = Math.max(maxArea, currentArea);
        }
        System.out.println();
        return maxArea;
    }

    public static void main(String[] args) {
        Q6_LargestRectangleByContiguousHistogram obj = new Q6_LargestRectangleByContiguousHistogram();
        Integer[] heights = {90, 58, 69, 70, 82, 100, 13, 57, 47, 18};
//                2,1,4,7,5,2,1,3,4,5,6,4,3,2,3,1,5,6,4,2};
        System.out.println(Arrays.toString(heights));
        System.out.println(obj.largestRectangleArea(heights));
    }
}
