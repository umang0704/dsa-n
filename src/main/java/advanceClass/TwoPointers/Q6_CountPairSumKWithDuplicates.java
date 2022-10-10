package advanceClass.TwoPointers;

public class Q6_CountPairSumKWithDuplicates {
    
    static int nCr(int n, int r) {
        return fact(n) / (fact(r) *
                fact(n - r));
    }

    static int fact(int n) {
        if (n == 0)
            return 1;
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }

    static int countPairs(int[] arr, int k) {
        int l = 0, r = arr.length - 1, count = 0;
        while (l < r) {
            if (arr[l] == k / 2) {
                int i = l + 1, countL = 1;
                while (arr[i++] == k / 2 && i < arr.length) countL++;
                count += countL > 1 ? nCr(countL, 2) : countL;
                l = i-1;
            } else if (arr[r] == k / 2) {
                int j = r - 1, countR = 1;
                while (arr[j--] == k / 2 && j >= 0) countR++;
                count += countR > 1 ? nCr(countR, 2) : countR;
                r = j+1;
            } else {
                int sum = arr[l] + arr[r];
                if (sum == k) {
                    int i = l + 1, j = r - 1, countL = 1, countR = 1;
                    while (arr[i++] == arr[l] && i < arr.length) countL++;
                    while (arr[j--] == arr[r] && j >= 0) countR++;
                    l = i-1;
                    r = j+1;
                    count += countL * countR;
                } else if (sum < k) l++;
                else r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countPairs(new int[]{1, 3, 4, 4, 5, 5, 5, 5, 6, 6, 6, 7,10}, 10));
    }
}
