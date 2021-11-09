public class MoreOnConstructorExample {
    public static void main (String[] args) {
        Students a;
        a = new Students(23, "Katie", 45.5f);
        Students b = new Students(33, "Harris", 89.7f);
        System.out.println(a.marks);
        System.out.println(b.name);
        b.greeting();
        a.sum(6);
    }
}
class Students {
    int roll;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }

    void sum(int i) {
        System.out.println(this.marks + i);
    }

    public Students(int i, String katie, float v) {
        this.roll = i;
        this.name = katie;
        this.marks = v;
    }
}