import java.lang.String;

public class PermutationRecursion {
    public static void main(String[] args) {
        String a = "abcd";
        Permutation(a, "");
    }
    public static void Permutation(String a, String ans) {
        if(a.isEmpty()) {
            System.out.println(ans);
            return;
        }
        String temp;
        for(int i = 0; i < ans.length() + 1; i++) {
            if(ans.isEmpty())
                temp = String.valueOf(a.charAt(0));
            else
                temp = ans.substring(0, i) + a.charAt(0) + ans.substring(i, ans.length());
            Permutation(a.substring(1), temp);
        }
    }
}