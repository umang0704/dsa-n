package intermediateClass.Hashing1;

import java.util.*;

public class Q1 {
    public ArrayList<Integer> pfSumArray(ArrayList<Integer> A){
        ArrayList<Integer> answer = new ArrayList();
        answer.add(A.get(0));
        for(int i = 1 ; i < A.size() ;i++){
            answer.add(answer.get(i-1)  + A.get(i));
        }
        return answer;
    }
    public ArrayList<Integer> lszero(ArrayList<Integer> A) {
        ArrayList<Integer> pfSumArray = pfSumArray(A);

        System.out.println(pfSumArray);
        ArrayList<Integer> answer = new ArrayList();
        LinkedHashMap<Integer,ArrayList<Integer>> freqMap = new LinkedHashMap();
        for(int i = 0 ; i < pfSumArray.size() ;i++){
            ArrayList<Integer> temp;
            if(freqMap.containsKey(pfSumArray.get(i))){
                temp = freqMap.get(pfSumArray.get(i));
            }else{
                temp = new ArrayList();
            }
            temp.add(i);
            freqMap.put(pfSumArray.get(i),temp);
        }
        System.out.println(freqMap);
        int maxLength = -1;
        for(Map.Entry<Integer,ArrayList<Integer>> entrySet : freqMap.entrySet()){
            ArrayList<Integer> current = entrySet.getValue();
            if(entrySet.getKey() == 0){
                int currentLength = current.get(current.size()-1)+1;
                if(maxLength < currentLength){
                    maxLength = currentLength;
                    answer.clear();
                    answer.addAll(A.subList(0,current.get(current.size()-1)+1));
                }
            }else{
                int start = current.get(0);
                int end = current.get(current.size()-1);
                int currentLength = end - start;
                if(currentLength > maxLength){
                    maxLength = currentLength;
                    answer.clear();
                    answer.addAll(A.subList(start+1,end+1));
                }
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Integer[] arr = {-9, -13, 6, -28, 27, -5, -27, 17, 15, -17, -25, 6, -8, 2, -13, -13, -23, 21, -4, 22, -9, -10, 0, -28, -11, 8, 8, 17};
        ArrayList<Integer> a = new ArrayList(){{addAll(Arrays.asList(arr));}};
        System.out.println(a);
        Q1 o = new Q1();
        System.out.println(o.lszero(a));
    }
}
