package Advance.BinarySearch2;

//Question:
//Find Square Root
//TC: O(log n) SC: O(1)
public class Q4_SquareRoot {
    static int squareRoot(int k) {
        if (k == 1 || k == 0) return k; //edge case
        int l = 2, r = k;
        int ans = -1;
        while (l <= r) {//binary search to find square root
            int mid = (l + r) / 2;//finding mid using l , r
            if (mid * mid == k) return mid;//if mid is square root
            else if (mid * mid < k) {//if mid^2 < k
                ans = Math.max(ans, mid); //taking max of mid^2 values to reach mid^2 < k
                l = mid + 1;//neglecting left part of range till mid as mid^2 < k
            } else {
                r = mid - 1;//if id^2 > k, neglect range right to mid.
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("10: " + squareRoot(10));
        System.out.println("103: " + squareRoot(103));
        System.out.println("14: " + squareRoot(14));
        System.out.println("11: " + squareRoot(11));
        System.out.println("105: " + squareRoot(105));
    }
}
