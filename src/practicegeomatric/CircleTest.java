package practicegeomatric;

public class CircleTest {
    public static void main(String[] args) {
        Circle ci = new Circle(3.0);
        Circle ci1 = new Circle();
        Circle ci2 = new Circle("Yellow", true, 5.0);
        System.out.println(ci);
        System.out.println(ci1);
        System.out.println(ci2);
    }
}
