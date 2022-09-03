package Advance.BinarySearch1;

public class Q2 {
    static int floor(int[] arr, int k) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int mid = (r + l) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (mid <= arr.length - 2 && arr[mid] < k && arr[mid + 1] > k) {
                return mid;
            } else if (arr[mid] > k) r = mid - 1;
            else l = mid + 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(floor(new int[]{-5, 2, 3, 6, 9, 10, 11, 14, 18}, 7));
    }
}
