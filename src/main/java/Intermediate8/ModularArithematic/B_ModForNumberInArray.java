package Intermediate8.ModularArithematic;

public class B_ModForNumberInArray {
    public int pow(int a, int n, int p){
        long ans = 1;
        for(int i = 0 ; i < n ;i++){
            ans = (ans%p * a%p)%p;
        }
        return (int)ans;
    }
    public int mod(int[] a, int p){
        long ans = 0;
        int n = a.length;
        for(int i = 0 ; i < a.length ;i++){
            ans = ans + ((a[i]%p)+(pow(10,n-i,p)))%p;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        int a[] = {2,3,3,4,6,7,3,6,8,7,4,2,6,8,2,3,4,6,7,3,6,4,7,4,2,6,8,2};
        int p = 23;
        System.out.println(new B_ModForNumberInArray().mod(a,p));
    }
}
