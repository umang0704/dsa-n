package advanceClass.TwoPointers;

public class Q1_2SumSortedArray {
    static int countPair(int[] arr, int k) {
        int l = 0, r = arr.length - 1, count = 0;
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == k) {
                count++;
                l++;
                r--;
            } else if (sum < k) l++;
            else r--;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPair(new int[]{-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 17));
    }
}
