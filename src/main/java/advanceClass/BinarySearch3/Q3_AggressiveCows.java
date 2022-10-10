package advanceClass.BinarySearch3;

public class Q3_AggressiveCows {
    boolean checkForMid(int[] arr, int mid, int cows){
        int prevCowLocation = arr[0];
        int cowsAllocated = 1;
        for(int i = 1; i < arr.length ; i++){
            if(arr[i] - prevCowLocation >= mid){
                cowsAllocated++;
                prevCowLocation = arr[i];
            }
            if(cowsAllocated == cows) return true;
        }
        return false;
    }

    int findMaximizedMin(int [] arr, int m){
        int l = 1;
        int r = arr[arr.length - 1] - arr[0];
        int ans = -1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if(checkForMid(arr,mid,m)){
                ans = mid;
                l = mid + 1;
            }else{
                r = mid -1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] a = {2,6,11,14,19,25,30,39,43};
        int m = 4;
        System.out.println(new Q3_AggressiveCows().findMaximizedMin(a,m));
    }
}
