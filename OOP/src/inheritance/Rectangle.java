package inheritance;

public class Rectangle extends Shape {

    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double getPerimeter() {
        return ((getA() + getB()) * 2);
    }
}
