package advanceClass.BinarySearch4;

public class Q1_NTaskKWorker {
    static int solve(int[] arr, int m) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i : arr) {
            min = Math.min(min, i);
            sum += i;
        }
        int l = min, r = sum, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (check(arr, mid, m)) {
                ans = mid;
                r = mid - 1;
            } else l = mid + 1;
        }
        return ans;
    }

    private static boolean check(int[] arr, int mid, int m) {
        int worker = 1;
        int current_work = 0;
        for (int i = 0; i < arr.length; i++) {
            if (current_work + arr[i] <= mid) current_work += arr[i];
            else {
                worker++;
                current_work = arr[i];
            }
        }
        if (worker > m) return false;
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,1,7,8,2,6,3,10,1,4,7,5,4,6};
        System.out.println(solve(arr,4));
    }
}
