package Intermediate8;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ValidSudoko {
    public static int isValidSudoku(final List<String> A) {
        HashSet<Integer> r1 = new HashSet<>();
        HashSet<Integer> r2 = new HashSet<>();
        HashSet<Integer> r3 = new HashSet<>();
        for(String i : A){
            for(Character c : i.toCharArray()){
                Integer t = Character.getNumericValue(c);
                if(r1.contains(t)){
                    System.out.println(r1+"-"+r2+"-"+r3);
                    return 0;
                }else{
                    r1.add(t);
                }
            }
            if(r1.size()> 9) {
                System.out.println(r1+"-"+r2+"-"+r3);
                return 0;
            }
            r1.clear();
        }
//        System.out.println(r1+"-"+r2+"-"+r3);
        r1.clear();
        for(int i = 0 ; i < 9 ; i++){
            for(int j=0 ; j < 9 ; j++){
                Integer t = Character.getNumericValue(A.get(i).charAt(j));
                if(r1.contains(t)){
                    System.out.println(r1+"-"+r2+"-"+r3);
                    return 0;
                }else{
                    r1.add(t);
                }
            }
            if(r1.size()> 9) {
                System.out.println(r1+"-"+r2+"-"+r3);
                return 0;
            }
        }
//        System.out.println(r1+"-"+r2+"-"+r3);
        r1.clear();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(j<3){
                    Integer t = Character.getNumericValue(A.get(i).charAt(j));
                    r1.add(t);
                }else if (j>2&&j<6){
                    Integer t = Character.getNumericValue(A.get(i).charAt(j));
                    r2.add(t);
                }else{
                    Integer t = Character.getNumericValue(A.get(i).charAt(j));
                    r3.add(t);
                }
            }
            if((i==2 || i==5 || i==8) && r1.size()!=9 && r2.size()!=9 && r3.size()!=9){
                System.out.println(r1+"-"+r2+"-"+r3);
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("..5.....6", "....14...", ".........", ".....92..", "5....2...", ".......3.", "...54....", "3.....42.", "...27.6..");
        System.out.println(isValidSudoku(strings));
    }
}
