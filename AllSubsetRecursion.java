import java.lang.String;

public class AllSubsetRecursion {
    public static void main(String[] args) {
        String name = "rebc";
        StringRecursion(name, "");
    }
    public static void StringRecursion(String name, String sub) {
        if(name.equals("")) {
            System.out.println(sub);
            return;
        }
        StringRecursion(name.substring(1), sub);
        StringRecursion(name.substring(1), sub + name.charAt(0));
    }
}