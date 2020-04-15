package practicegeomatric;

public class testRectangle {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        Rectangle re1 = new Rectangle(5,6);
        Rectangle re2 = new Rectangle(5,9,"black",true);

        System.out.println(re);
        System.out.println(re.getArea());
        System.out.println(re1);
        System.out.println(re1.getPerimeter());
        System.out.println(re2);
    }


}
