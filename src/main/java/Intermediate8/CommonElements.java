package Intermediate8;

import java.util.HashMap;
import java.util.Map;

public class CommonElements {
    public int[] solve(int[] A, int[] B) {
        HashMap<Integer,Integer> hs = new HashMap();
        int i = 0;
        while(i<A.length || i<B.length){
            if(i<A.length ){
                 if(hs.containsKey(A[i]))  hs.put(A[i], hs.get(A[i]) + 1); else  hs.put(A[i], 1);
            }
            if(i<B.length ){
                if(hs.containsKey(B[i])==true) hs.put(B[i], hs.get(B[i]) + 1); else hs.put(B[i], 1);
            }
        }
        int c = 0;
        for(Map.Entry<Integer,Integer> e  : hs.entrySet()){
            if(e.getValue()>1) c++;
        }
        int[] a = new int[c];
        i=0;
        for(Map.Entry<Integer,Integer> e  : hs.entrySet()){
            if(e.getValue()>1) a[i]=e.getKey();
        }
        return a;
    }
    public static void main(String[] args) {

    }
}
