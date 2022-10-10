package advanceClass.GCD;

import advanceClass.utils.GetValue;

public class Q4 {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Integer[] intArray = GetValue.getIntArray();
        int max = intArray[0];
        int min = intArray[0];
        for (int i = 0; i < intArray.length; i++) {
            max = Math.max(max, intArray[i]);
            min = gcd(intArray[i],min);
        }
        System.out.println("Min:" + min);
        System.out.println("Length : "+ (max/min));

    }
}
