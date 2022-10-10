package advanceClass.GCD;

import advanceClass.utils.GetValue;

public class GCD_Euclidean {
    static int gcd_diff(int a, int b){
        if(a<b){
            int t = a;
            a = b;
            b = t;
        }
        if(b==0) return a;
        return gcd_diff(a-b,b);
    }
    static int gcd_mod(int a ,int b){
        if(b==0) return a;
        return gcd_mod(b,a%b);
    }
    public static void main(String[] args) {
        int a = GetValue.scanInt("a:");
        int b = GetValue.scanInt("b:");
        System.out.println("gcd_diff: " + gcd_diff(a,b));
        System.out.println("gcd_mod: "+gcd_diff(a,b));
    }
}
