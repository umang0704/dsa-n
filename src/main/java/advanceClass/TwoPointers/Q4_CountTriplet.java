package advanceClass.TwoPointers;

public class Q4_CountTriplet {
    static int countTriplet(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int c = arr[i];
            int l = i + 1, r = arr.length - 1;
            while (l < r) {
                int sum = arr[l] + arr[r] + c;
                if (sum == k) {
                    count++;
                    l++;
                    r--;
                } else if (sum < k) l++;
                else r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countTriplet(new int[]{-8,-4-3-1,2,3,5,7,9},14));
    }
}
