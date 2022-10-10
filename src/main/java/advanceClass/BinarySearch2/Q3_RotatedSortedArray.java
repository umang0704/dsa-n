package advanceClass.BinarySearch2;


import java.util.Arrays;

/**
 * Question:
 * Given a  clockwise rotated sorted array of distinct elements. Find if 'k' exists
 * TC : O(log n + log n) = O(log n)
 * SC: O(1)
 */
public class Q3_RotatedSortedArray {
    static int binarySearch(int[] arr, int l, int r, int k) {
        while (l <= r) {

            int mid = (l + r) / 2;

            if (arr[mid] == k) return mid;

            else if (arr[mid] > k) r = mid - 1;

            else l = mid + 1;
        }

        return -1;

    }

    static int pointOfRotation(int[] arr) {

        int l = 0, r = arr.length - 1;

        while (l <= r) {

            int mid = (l + r) / 2;

            // if element is smaller than adjacent elements
            if (arr[mid] < arr[mid - 1] && arr[mid] < arr[mid + 1])

                return mid;

                // if mid element is greater than last element, then POR is in between 0 and mid -1
            else if (arr[mid] > arr[arr.length - 1])

                l = mid + 1;
                //if mid element is smaller than last element, then POR is in between (mid + 1) and (n-1)
            else r = mid - 1;
        }

        return -1;
    }

    static int findK(int[] arr, int k) {
        if (arr.length == 0) return -1; // if array is empty

        if (arr[0] == k) return 0; //if 1st element is k

        if (arr[arr.length - 1] == k) return arr.length - 1;//if last element is k

        int por = pointOfRotation(arr); //finding POR

        if (por != -1) { // if POR exists

            if (k > arr[arr.length - 1]) { // if k > last element, then it is in first sorted array

                return binarySearch(arr, 0, por - 1, k);

            } else {// k < last element, hence k is in 2nd sorted array.

                return binarySearch(arr, por, arr.length - 1, k);
            }

        } else return -1;

    }

    public static void main(String[] args) {
        int[] a = {4, 5, 6, 1, 2, 3};
        System.out.println(Arrays.toString(a) + "-" + findK(a, 4));
        System.out.println(Arrays.toString(a) + "-" + findK(a, 3));
        System.out.println(Arrays.toString(a) + "-" + findK(a, 6));
        System.out.println(Arrays.toString(a) + "-" + findK(a, 2));
    }
}
