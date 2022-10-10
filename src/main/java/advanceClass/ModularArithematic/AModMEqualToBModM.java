package advanceClass.ModularArithematic;

public class AModMEqualToBModM {
    static int aModMEqualToBModM(int a, int b, int m) {
        int count = 0;
        for(int i = 1 ; i * i < (a-b) ; i++){
            if((a-b)%2==0) count += 2;
        }
        return count == 2 ? 1 : count;
    }

    public static void main(String[] args) {

    }
}
