package intermediateClass;

import java.util.Arrays;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] A) {
        Arrays.sort(A,(a, b)->{
            if(a.length()>b.length()) return 1;
            else if(a.length()<b.length()) return -1;
            else return 0;
        });
        for(String s : A) System.out.println(s);
        for(int i = 0 ; i < A[0].length() ;i++){
            for(int j = 1 ; j < A.length ; j++){
                if(A[0].charAt(i)!=A[j].charAt(i)){
                    return i==0 ?"":A[0].substring(0,i);
                }
            }
        }
        return A[0];
    }
    public static void main(String[] args) {
//        String[] a ={ "aaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa"};
        String[] a ={"abcd", "abcd", "efgh"};
        System.out.println(new LongestCommonPrefix().longestCommonPrefix(a));
    }
}
