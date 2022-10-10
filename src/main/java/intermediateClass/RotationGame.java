package intermediateClass;

import java.util.Scanner;

public class RotationGame {
    static Integer[] reverseArray(Integer[] arr, Integer from, Integer to){
        while(from<=to){
            int t = arr[from];
            arr[from] = arr[to];
            arr[to] = t;
            from++;
            to--;
        }
        return arr;
    }
    static Integer[] rotate(Integer[] arr, Integer n){
        n = n% arr.length;
        arr = reverseArray(arr,0,arr.length-1);
        arr = reverseArray(arr,0,n-1);
        arr = reverseArray(arr,n,arr.length-1);
        return arr;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        Integer size = sc.nextInt();
        Integer[] arr = new Integer[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        Integer n = sc.nextInt();
        arr = rotate(arr,n);
        for(Integer e : arr){
            System.out.print(e+" ");
        }
    }
}
