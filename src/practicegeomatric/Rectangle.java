package practicegeomatric;

public class Rectangle extends Shape {
    private double width = 4;
    private double height = 2;

    public Rectangle(){};
    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public Rectangle(double width, double height, String color, Boolean filled){
        super(color, filled);
        this.height = height;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return (width+height)*2;
    }
    @Override
    public String toString(){
        return "A rectangle with width = " +getWidth() + " and length = " + getHeight() + "which is a subclass of " + super.toString();
    }
}
