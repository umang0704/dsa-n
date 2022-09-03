package Intermediate8;

public class LongestPalindromicSubsequence {
    String checkPalindrome(char[] c, int i){
        int l = i-1,r=i+1;
        int ol = 1;
        StringBuilder os = new StringBuilder(""+c[i]);
        while(l>=0 && r<=c.length-1){
            if(c[l]==c[r]) {
                ol+=2;
                os.insert(0,c[l]);
                os.append(c[r]);
                l--;r++;
            }else{
                break;
            }
        }
        l=i;r=i+1;
        int el=0;
        StringBuilder es = new StringBuilder();
        while(l>=0 && r<=c.length-1){
            if(c[l]==c[r]) {
                el+=2;
                es.insert(0,c[l]);
                es.append(c[r]);
                l--;r++;
            }else{
                break;
            }
        }
        return el>ol?es.toString():os.toString();
    }
    public String longestPalindrome(String A) {
        String max = "";
        char[] c = A.toCharArray();
        for(int i = 0 ; i < c.length ; i++){
            String t = checkPalindrome(c,i);
            if(t.length()>max.length()) max = t;
        }
        return max;
    }

    public static void main(String[] args) {
        String s = "aaaabaaa";
        System.out.println(new LongestPalindromicSubsequence().longestPalindrome(s));
    }
}
