public class OopsExample {
    public static void main (String[] args) {
        Students a;
        Students[] arr = new Students[5];
        a = new Students();
        a.roll = 45;
        a.name = "Harry";
        a.marks = 90.55f;
        System.out.println(a.marks);
    }
}
class Students {
    int roll;
    String name;
    float marks;
}