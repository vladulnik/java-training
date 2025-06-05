package examples;

public class Rect {
    double length;
    double width;

    void setSize(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double getArea() {
        return length * width;
    }
}
