package Advance.BinarySearch2;

import java.util.Arrays;

//Question
//unsorted arr arr[n] of distinct elements,Find any local minima. minima is element smaller than adjacent elements
//TC : O(log n)
public class Q1_LocalMinima {
    private static int localMinima(int[] arr) {
        int i = 1;
        if (arr.length == 1) return arr[0];//if array has only 1 element
        if (arr[0] < arr[1]) return arr[0];//if 1st is local minima
        if (arr[arr.length - 1] < arr[arr.length - 2]) return arr[arr.length - 1];//if last is local minima
        int l = 1, r = arr.length - 2;
        while (l <= r) {//binary search by dividing and neglecting half of the array.
            int mid = (l + r) / 2;//calculating mid
            if (arr[mid - 1] > arr[mid] && arr[mid + 1] > arr[mid]) return arr[mid];//if middle element is dip
            else if (arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
                l = mid + 1;//if middle elements is in monotonically decreasing state, neglect array from l to mid
            else r = mid - 1;//if mid is in monotonically increasing state, neglect mid+1 to r array
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {11, 9, 8, 7, 6, 5, 4};
        int[] b = {1, 2, 3, 5};
        int[] c = {10, 7, 6, 8, 11, 12, 13};
        System.out.println(Arrays.toString(a) + "-" + localMinima(a));
        System.out.println(Arrays.toString(b) + "-" + localMinima(b));
        System.out.println(Arrays.toString(c) + "-" + localMinima(c));
    }
}
