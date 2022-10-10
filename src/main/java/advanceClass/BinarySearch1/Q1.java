package advanceClass.BinarySearch1;

public class Q1 {
    static int binarySearch(int[] arr, int k){
        int l = 0, r = arr.length-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid] == k) return mid;
            else if(arr[mid] > k) r = mid -1;
            else l = mid +1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{3,6,9,12,14,19,20,23,25,27},20));
    }
}
