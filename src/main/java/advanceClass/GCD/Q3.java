package advanceClass.GCD;

import advanceClass.utils.GetValue;

public class Q3 {
    static int gcd(int a,int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Integer[] intArray = GetValue.getIntArray();
        int gcd = intArray[0];
        for(Integer i : intArray) gcd = Math.min(gcd,gcd(i,gcd));
        if(gcd == 1) System.out.println("Yes");
        else System.out.println("No");
    }
}
