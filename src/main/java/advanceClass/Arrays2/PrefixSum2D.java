package advanceClass.Arrays2;

import java.util.ArrayList;
import java.util.Random;

public class PrefixSum2D {
    public  ArrayList<ArrayList<Integer>> pfSumList(ArrayList<ArrayList<Integer>> A) {
        //row wise pfSum of single array
        for (int i = 0; i < A.size(); i++) {
            ArrayList<Integer> row = A.get(i);
            for (int j = 1; j < row.size(); j++) {
                row.set(j, row.get(j - 1) + row.get(j));
            }
            A.set(i, row);
        }
        //col wise pfSum
        for (int j = 0; j < A.get(0).size(); j++) {
            for (int i = 1; i < A.size(); i++) {
                ArrayList<Integer> temp = A.get(i);
                temp.set(j, A.get(i - 1).get(j) + temp.get(j));
                A.set(i, temp);
            }
        }
        return A;
    }

    public  int[][] pfSumArray(int[][] arr) {
        //row wise pfSum
        for (int i = 0; i < arr.length; i++) {
            int[] row = arr[i];
            for (int j = 1; j < row.length; j++) {
                row[j] = row[j - 1] + row[j];
            }
            arr[i] = row;
        }
        //col wise pfSum
        for (int j = 0; j < arr[0].length; j++) {
            for (int i = 1; i < arr.length; i++) {
                arr[i][j] = arr[i - 1][j] + arr[i][j];
            }
        }
        return arr;
    }

    public  Integer findSubMatrixSum(ArrayList<ArrayList<Integer>> A, int i1, int j1, int i2, int j2) {
        ArrayList<ArrayList<Integer>> pfSum = pfSumList(A);
        print2DList(pfSum);
        int im = A.size();
        int jm = A.get(0).size();
        System.out.println(pfSum.get(i2).get(j2));
        Integer s = pfSum.get(i2).get(j2);
        if (i1 > 0) {
            s -= pfSum.get(i1 - 1).get(j2);
            System.out.println(pfSum.get(i1 - 1).get(j2));
        }
        if (j1 > 0) {
            s -= pfSum.get(i2).get(j1 - 1);
            System.out.println(pfSum.get(i2).get(j1 - 1));
        }
        if (i1 > 0 && j1 > 0) {
            s += pfSum.get(i1 - 1).get(j1 - 1);
            System.out.println(pfSum.get(i1 - 1).get(j1 - 1));
        }
        return s;
    }

    public static void main(String[] args) {
        PrefixSum2D prefixSum2D = new PrefixSum2D();
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < 4; j++) {
                temp.add(new Random().nextInt(9));
            }
            testList.add(temp);
        }
        prefixSum2D.print2DList(testList);
//        prefixSum2D.print2DList(prefixSum2D.pfSumList(testList));
        System.out.println(prefixSum2D.findSubMatrixSum(testList, 1, 1, 3, 3));
        int[][] testArray = new int[4][4];
        for (int i = 0; i < 4; i++) {
            int[] temp = new int[4];
            for (int j = 0; j < 4; j++) {
                temp[j] = new Random().nextInt(9);
            }
            testArray[i] = temp;
        }
        prefixSum2D.print2DArray(testArray);
        prefixSum2D.print2DArray(prefixSum2D.pfSumArray(testArray));
    }

    public  void print2DArray(int mat[][]) {
        System.out.println("____________________________________________________");
        // Loop through all rows
        for (int i = 0; i < mat.length; i++) {
            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++)
                System.out.print(mat[i][j] + ", ");
            System.out.println();
        }
        System.out.println("____________________________________________________");
    }

    public  void print2DList(ArrayList<ArrayList<Integer>> arr) {
        // Loop through all rows
        System.out.println("____________________________________________________");
        for (int i = 0; i < arr.size(); i++) {
            // Loop through all elements of current row
            for (int j = 0; j < arr.get(i).size(); j++)
                System.out.print(arr.get(i).get(j) + ", ");
            System.out.println();
        }
        System.out.println("____________________________________________________");
    }
}
