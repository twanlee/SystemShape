package practicegeomatric;

public class testSquare {
    public static void main(String[] args) {
        Square s1 = new Square();
        Square s2 = new Square(6);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s2.getArea());
    }
}
