package Advance.BinarySearch2;

import java.util.Arrays;

/**
 * Question
 * All elements are repeating except for one element, all repeating element are placed ajacent.
 * Find Non Repeating Unique element.
 */

public class Q2_UniqueElement {
    static int uniqueElement(int[] arr) {
        if (arr.length == 0 || arr.length == 2) return -1;//
        if (arr.length == 1) return arr[0];//size of array is 1
        if (arr[0] != arr[1]) return arr[0];//1st element not repeating
        if (arr[arr.length - 1] != arr[arr.length - 2]) return arr[arr.length - 1];//last element is not repeating
        int l = 0, r = arr.length - 1;
        while (l <= r) {//binary search to neglect half array for finding non repeating unique element
            int mid = (l + r) / 2;
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) // if mid is not repeating, found by comparing adjacent elements.
                return arr[mid];
            int firstOccurrence = mid;//assuming mid is first occurrence of mid element.
            if (arr[mid - 1] == arr[mid])//checking first occurrence of first element
                firstOccurrence = mid - 1;

            if (firstOccurrence % 2 == 0) l = mid + 1;//since first occurrence is even of mid, then there has not been
                // any unique element, can be checked by taking cases.
            else r = mid - 1;//since first occurrence pf mid is at odd position, this means, there has been an element
            //before mid.
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 3, 3, 4, 4};
        int[] b = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6};
        int[] c = {1, 1, 2, 2, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8};
        int[] d = {1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6, 7, 7};
        System.out.println(Arrays.toString(a) + "-" + uniqueElement(a));
        System.out.println(Arrays.toString(b) + "-" + uniqueElement(b));
        System.out.println(Arrays.toString(c) + "-" + uniqueElement(c));
        System.out.println(Arrays.toString(d) + "-" + uniqueElement(d));
    }
}
