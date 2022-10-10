package intermediateClass.ArraysAndMath;

public class A_JosephsProblem {
    public int pos(int n){
        int nearestPowerOf2 = -1;
        for(int i = n ; i >= 1 ; i--){
            if((i&(i-1))==0){
                nearestPowerOf2 = i;
                break;
            }
        }
        System.out.println(nearestPowerOf2);
        return 2*(n-nearestPowerOf2)+1;
    }
    public static void main(String[] args) {
        System.out.println(new A_JosephsProblem().pos(8));
    }
}
