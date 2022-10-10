package advanceClass.BinarySearch1;

public class Q3 {
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
        int[] arr = {-5,-5,-3,0,0,1,1,5,5,5,5,5,5,8,10,10,15,17};
        int k = 5;
        int f1 = floor(arr,k-1);
        int f2 = floor(arr,k+1);
        int ans = f1==0 ? f2 + 1: f2 - f1;
        System.out.println(ans);
    }
}
