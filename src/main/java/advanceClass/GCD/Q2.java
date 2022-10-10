package advanceClass.GCD;

import advanceClass.utils.GetValue;

public class Q2 {
    static int fact(int n){
        if(n==0) return 1;
        return n*fact(n-1);
    }
    static int gcd_of_factorials(Integer[] arr){
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            min = Math.min(arr[i],min);
        }
        return fact(min);
    }
    public static void main(String[] args) {
        Integer[] intArray = GetValue.getIntArray("Arr:");
        System.out.println("GCD of factorial of all array: "+gcd_of_factorials(intArray));

    }
}
