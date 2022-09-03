package Intermediate8;

import java.util.Arrays;

public class B_ChangeCharacter {
    public int solve(String A, int B) {
        int[] f = new int[26];
        for(int i = 0 ; i<A.length() ; i++){
            f[A.charAt(i)-'a']++;
        }
        Arrays.sort(f);
        for(int i = 0 ; i < f.length ; i++){
            if(f[i]!=0){
                if(f[i]<=B&&B>0){
                    B-=f[i];
                }else{
                    return 26-i;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        String s = "abcabbccd";
        System.out.println(new B_ChangeCharacter().solve(s,3));
    }
}
