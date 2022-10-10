package advanceClass.Arrays3;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIndexes {
    static ArrayList<ArrayList<Integer>> insert(ArrayList<ArrayList<Integer>> indexes, ArrayList<Integer> insertIndex ){
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        for(int i = 0 ; i < indexes.size() ; i++){
            if(indexes.get(i).get(1)<insertIndex.get(0)) res.add(indexes.get(i));
            else if(indexes.get(i).get(0) > insertIndex.get(1)){
                res.add(insertIndex);
                while(i < indexes.size()) res.add(indexes.get(i++));
                return res;
            }else{
                insertIndex.set(0,Math.min(indexes.get(i).get(0),insertIndex.get(0)));
                insertIndex.set(1,Math.max(indexes.get(i).get(1),insertIndex.get(1)));
            }
        }
        res.add(insertIndex);
        return res;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> indexes = new ArrayList<>();
        indexes.add(new ArrayList<>(Arrays.asList(1, 3)));
        indexes.add(new ArrayList<>(Arrays.asList(4, 7)));
        indexes.add(new ArrayList<>(Arrays.asList(10, 14)));
        indexes.add(new ArrayList<>(Arrays.asList(16, 19)));
        indexes.add(new ArrayList<>(Arrays.asList(21, 24)));
        indexes.add(new ArrayList<>(Arrays.asList(27, 30)));
        indexes.add(new ArrayList<>(Arrays.asList(32, 35)));
        ArrayList<Integer> insertIndexes = new ArrayList<Integer>();
        insertIndexes.add(15);
        insertIndexes.add(22);
        System.out.println(indexes);
        System.out.println(insertIndexes);
        System.out.println(insert(indexes,insertIndexes));

    }
}
