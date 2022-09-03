package Advance.Arrays3;

import java.util.Arrays;

public class MissingPositiveNaturalNumber {
    //using extra space as boolean array
    //TC : O(n) SC: O(n)
    static int approach1(int[] a){
        boolean[] freq = new boolean[a.length+1];
        for(int i : a) if(i>=0 && i <= a.length+1) freq[i] = true;
        for(int i = 1 ; i < freq.length ; i++) if(freq[i]==false) return i;
        return a.length;
    }
    //TC : n(logn) SC: depends
    static int approach2(int[] a){
        int[] arr = a;
        Arrays.sort(arr);
        int count = 1;
        for(int i : arr){
            if(i>0){
                if(i==count) count++;
                else return count;
            }
        }
        return a.length;
    }

    static int approach3(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i]>0 && arr[i]<arr.length){
                int correctIndex = arr[i] - 1;
                if(arr[correctIndex] != arr[i]){
                    int t = arr[correctIndex];
                    arr[correctIndex] = arr[i];
                    arr[i]=t;
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        for( i = 0 ; i < arr.length ; i++) if(i!=arr[i]-1) return i+1;
        return arr.length;
    }
    public static void main(String[] args) {
        int[] arr = { 3,0,3,6,9,4,1};
        System.out.println("Approach 1");
        System.out.println(Arrays.toString(arr));
        System.out.println(approach1(arr));
        System.out.println("Approach 2");
        System.out.println(Arrays.toString(arr));
        System.out.println(approach2(arr));
        System.out.println("Approach 3");
        System.out.println(Arrays.toString(arr));
        System.out.println(approach3(arr));
    }
}
