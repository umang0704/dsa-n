package advanceClass.TwoPointers;

public class Q5_MaxWater {
    static int maxWater(int[] arr) {
        int l = 0, r = arr.length - 1, maxWater = Integer.MIN_VALUE;
        while (l < r) {
            maxWater = Math.max((r - l) * Math.min(arr[r], arr[l]), maxWater);
            if (arr[l] < arr[r]) l++;
            else r--;
        }
        return maxWater;
    }

    public static void main(String[] args) {
        System.out.println(maxWater(new int[]{3,5,4,7,3,6,5,4,1,2}));
    }
}
