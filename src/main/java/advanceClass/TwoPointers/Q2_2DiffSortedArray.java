package advanceClass.TwoPointers;

public class Q2_2DiffSortedArray {
    static int countPair(int[] arr, int k) {
        int l = 0, r = 1, count = 0;
        while (r < arr.length) {
            int sum = arr[r] - arr[l];
            if (sum == k) {
                count++;
                r++;
                l++;
            } else if (sum < k) r++;
            else {
                l++;
                if(l==r) r++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPair(new int[]{-3, 0, 1, 3, 6, 8, 11, 14, 18, 25}, 5));
    }
}
