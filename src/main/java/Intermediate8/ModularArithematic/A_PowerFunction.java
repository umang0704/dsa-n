package Intermediate8.ModularArithematic;

public class A_PowerFunction {
    public int pow(int a, int n, int p){
        long ans = 1;
        for(int i = 0 ; i < n ;i++){
            ans = (ans%p * a%p)%p;
        }
        return (int)ans;
    }
    public static void main(String[] args) {
        System.out.println(new A_PowerFunction().pow((1<<8)+3,(1<<8)+11,(11)));
    }
}
