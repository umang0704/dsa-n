package advanceClass.TwoPointers;

public class Q3_CountSubArraySumK {
    static int[] calcPFSum(int[] arr) {
        int[] pf = new int[arr.length];
        pf[0] = arr[0];
        for (int i = 1; i < arr.length; i++) pf[i] = pf[i - 1] + arr[i];
        return pf;
    }

    static int countPairs(int[] arr, int k) {
        int[] pfSum = calcPFSum(arr);
        int l = 0, r = 1, count = 0;
        while (r < pfSum.length) {
            int diff = pfSum[r] - ((l == 0) ? 0 : pfSum[l - 1]);
            if (diff == k) {
                count++;
                r++;
                l++;
            } else if (diff < k) r++;
            else {
                l++;
//                if (l == r) r++; // it will remove single element sub array
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{3,3,5,1,8,6,2,6},6));
    }
}
