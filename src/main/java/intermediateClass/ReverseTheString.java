package intermediateClass;

public class ReverseTheString {
    char[] reverse(char[] c, int l , int r){
        while(l<r){
            char t = c[l];
            c[l] = c[r];
            c[r] = t;
            l++;r--;
        }
        return c;
    }
    public String solve(String A) {
        // A = A.trim();
        char[] c = A.toCharArray();
        c = reverse(c,0,c.length-1);
        c = new String(c).trim().toCharArray();
        // System.out.println(new String(c));
        for(int i = 0; i < c.length ;i++){
            int j=i+1;
            for( ; j<c.length ; j++){
                if(c[j]==' '){
                    c = reverse(c,i,j-1);
                    // System.out.println(new String(c)+"-"+i+"-"+j);
                    while(c[j]!=' ') j++;
                    i = j;
                    break;
                }
            }
            if(j == c.length) {
                c=reverse(c,i,j-1);
                i=j;
                // System.out.println(new String(c)+"-"+i+"--"+j);
            }
        }

        return new String(c);
    }

    public static void main(String[] args) {
        String s = "crulgzfkif gg ombt vemmoxrgf qoddptokkz op xdq hv ";
        System.out.println(new ReverseTheString().solve(s));
    }
}
