import java.lang.String;

public class StringManupulationnRecursion {
    public static void main(String[] args) {
        String name = "abiaracdaa";
        String ans = StringRecursion(name, "", 0);
        System.out.println(ans);
    }
    public static String StringRecursion(String name, String ans, int i) {
        if(i == name.length())
            return ans;
        if(name.charAt(i) != 'a')
            ans = ans.concat(String.valueOf(name.charAt(i)));
        return StringRecursion(name, ans, i + 1);
    }
}