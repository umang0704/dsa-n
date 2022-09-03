package Advance.Arrays3;
//find max value of pair i,j. where |arr[i]+arr[j]|+|i+j|
//hint : open mods and come to result
public class FindMaxPair {

    static int findMax(int[] arr){
        int i_sum_max=arr[0],i_sum_min=arr[0],i_sub_max=arr[0],i_sub_min=arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            int i_sum = arr[i]+i;
            int i_sub = arr[i]-i;
            if(i_sum > i_sum_max) i_sum_max = i_sum;
            if(i_sub > i_sub_max) i_sub_max = i_sub;
            if(i_sum < i_sum_min) i_sum_min = i_sum;
            if(i_sub < i_sub_min) i_sub_min = i_sub;
        }
        return Math.max(i_sum_max-i_sum_min,i_sub_max-i_sub_min);
    }
    public static void main(String[] args) {
        int[] arr = { -98, -5, 37, -97, 38, 22, 70, 42, 61, 84}; //{2,5,4,1,6};
        System.out.println(findMax(arr));
    }
}
