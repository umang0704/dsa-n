package advanceHW.BinarySearch2;

import java.util.ArrayList;

/**
 * Problem Description
 * Given an array of integers A and an integer B, find and return the maximum value K such that there is no subarray in A of size K with the sum of elements greater than B.
 *
 *
 *
 * Problem Constraints
 * 1 <= |A| <= 100000
 * 1 <= A[i] <= 10^9
 *
 * 1 <= B <= 10^9
 *
 *
 *
 * Input Format
 * The first argument given is the integer array A.
 *
 * The second argument given is integer B.
 *
 *
 *
 * Output Format
 * Return the maximum value of K (sub array length).
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [1, 2, 3, 4, 5]
 * B = 10
 * Input 2:
 *
 * A = [5, 17, 100, 11]
 * B = 130
 *
 *
 * Example Output
 * Output 1:
 *
 *  2
 * Output 2:
 *
 *  3
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * Constraints are satisfied for maximal value of 2.
 * Explanation 2:
 *
 * Constraints are satisfied for maximal value of 3.
 */
public class A3_SpecialInteger {
    boolean checkSizePossible(ArrayList<Integer> a, int windowSize, int B){
        long sum = 0;
        for(int i = 0 ; i < windowSize ; i++) sum += a.get(i);
        if(sum > B) return false;
        for(int i = windowSize ; i < a.size() ; i++){
            sum = sum -a.get(i- windowSize) + a.get(i);
            if(sum > B) return false;
        }
        return true;
    }
    public int solve(ArrayList<Integer> A, int B) {
        int l = 0 ,r = A.size()-1;
        int ans  = -1;
        while(l <= r){
            int mid = (l + r)/2;
            if(checkSizePossible(A,mid+1,B)){
                ans = mid + 1;
                l = mid + 1;
            }else{
                r = mid - 1;
            }
        }
        return ans == -1 ? 0 : ans;
    }

    public static void main(String[] args) {
        A3_SpecialInteger o = new A3_SpecialInteger();
//        System.out.println(o.solve(Arrays.asList(5, 10, 20, 100, 105), 130));
    }
}