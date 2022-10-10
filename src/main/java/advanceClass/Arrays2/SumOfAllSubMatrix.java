package advanceClass.Arrays2;

import java.util.ArrayList;
import java.util.Random;

public class SumOfAllSubMatrix {
    Long sumOfAllSubMatrix(ArrayList<ArrayList<Integer>> A){
        Long sum = 0l;
        for(int rowIndex = 0 ; rowIndex < A.size() ; rowIndex++){
            ArrayList<Integer> row = A.get(rowIndex);
            for(int colIndex = 0 ; colIndex < row.size() ; colIndex++){
                sum += row.get(colIndex)*((rowIndex+1)*(colIndex+1))*(A.size()-rowIndex)*(A.get(rowIndex).size()-colIndex);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        PrefixSum2D prefixSum2D = new PrefixSum2D();
        SumOfAllSubMatrix sumOfAllSubMatrix = new SumOfAllSubMatrix();
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(new Random().nextInt(9));
            }
            testList.add(temp);
        }
        prefixSum2D.print2DList(testList);
        System.out.println(sumOfAllSubMatrix.sumOfAllSubMatrix(testList));
    }
}
