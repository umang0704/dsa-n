package advanceClass.Stacks2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Q7_SumMaxMinOfAllSubArrays {
    long m = 1000 * 1000 * 1000 + 9;

    public int solve(ArrayList<Integer> A) {
        Integer[] leftLargest = nearestLargestElementIndexOnLeft(A);
        Integer[] leftSmallest = nearestSmallestElementIndexOnLeft(A);
        Integer[] rightLargest = nearestLargestElementIndexOnRight(A);
        Integer[] rightSmallest = nearestSmallestElementIndexOnRight(A);
        long sum = 0;
        for (int i = 0; i < A.size(); i++) {
            long largestContribution = ((rightLargest[i] - i) * (i - leftLargest[i]) * A.get(i))%m;
            long smallestContribution =  ((rightSmallest[i] - i) * (i - leftSmallest[i]) * A.get(i))%m;
            long differenceOfMaxAndMinContributions = largestContribution - smallestContribution;
            sum = (sum % m + differenceOfMaxAndMinContributions % m) % m;
        }
        return (int) sum;

    }

    Integer[] nearestSmallestElementIndexOnRight(ArrayList<Integer> a) {

        Stack<Integer> helper = new Stack();
        Integer[] answer = new Integer[a.size()];

        for (int i = a.size() - 1; i >= 0; i--) {
            Integer element = a.get(i);
            while (!helper.isEmpty() && a.get(helper.peek()) >= element)
                helper.pop();

            if (helper.isEmpty()) answer[i] = a.size();
            else answer[i] = helper.peek();

            helper.push(i);
        }

        return answer;
    }

    Integer[] nearestSmallestElementIndexOnLeft(ArrayList<Integer> a) {

        Stack<Integer> helper = new Stack();
        Integer[] answer = new Integer[a.size()];

        for (int i = 0; i < a.size(); i++) {
            Integer element = a.get(i);
            while (!helper.isEmpty() && a.get(helper.peek()) >= element)
                helper.pop();

            if (helper.isEmpty()) answer[i] = -1;
            else answer[i] = helper.peek();

            helper.push(i);
        }

        return answer;
    }

    Integer[] nearestLargestElementIndexOnLeft(ArrayList<Integer> a) {

        Stack<Integer> helper = new Stack();
        Integer[] answer = new Integer[a.size()];

        for (int i = 0; i < a.size(); i++) {
            Integer element = a.get(i);
            while (!helper.isEmpty() && a.get(helper.peek()) <= element)
                helper.pop();

            if (helper.isEmpty()) answer[i] = -1;
            else answer[i] = helper.peek();

            helper.push(i);
        }

        return answer;
    }

    Integer[] nearestLargestElementIndexOnRight(ArrayList<Integer> a) {

        Stack<Integer> helper = new Stack();
        Integer[] answer = new Integer[a.size()];

        for (int i = a.size() - 1; i >= 0; i--) {
            Integer element = a.get(i);
            while (!helper.isEmpty() && a.get(helper.peek()) <= element)
                helper.pop();

            if (helper.isEmpty()) answer[i] = a.size();
            else answer[i] = helper.peek();

            helper.push(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Integer[] arr = {992387, 932142, 971117, 934674, 988917, 967890, 948508, 970347};
        ArrayList<Integer> a = new ArrayList() {{
            addAll(Arrays.asList(arr));
        }};

        Q7_SumMaxMinOfAllSubArrays obj = new Q7_SumMaxMinOfAllSubArrays();
        System.out.println((obj.solve(a)));
    }

}
