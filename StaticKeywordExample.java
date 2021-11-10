public class StaticKeywordExample {
    public static void main(String[] args) {
        Car arr = new Car("Abir", 45.7f);
        Car ar = new Car("Hritik", 98.6f);
        Car n = new Car("rahul", 76.87f);
        System.out.println(Car.num);
    }
}
class Car {
    String name;
    float marks;
    static int num;

    Car(String name, float marks) {
        this.name = name;
        this.marks = marks;
        Car.num+= 1;
    }
}