package advanceHW.BinarySearch2;

public class A4_AthMagicalNo {
    long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public int solve(int A, int B, int C) {
        int m = 1000 * 1000 * 1000 + 7;
        long l = Math.min(B, C);
        long r = A * Math.min(B, C);
        long gcd = gcd(B, C);
        long lcm = (B / gcd) * C;
        long ans = -1;
        while (l <= r) {
            long mid = (l + r) / 2;
            long commonMultiple =  (mid / lcm);
            long divisibles = mid / Math.min(B, C) + mid / Math.max(B, C) - commonMultiple;
            if (divisibles >= A) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans == -1 ? ((int) (A * Math.min(B, C) % m)) : ((int) (ans % m));
    }

    public static void main(String[] args) {
        A4_AthMagicalNo obj = new A4_AthMagicalNo();
        System.out.println(obj.solve(14, 10, 12));
    }
}
