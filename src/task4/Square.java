package task4;

public class Square implements Shape {

    double length;

    public Square(double length) {
        this.length = length;
    }

    public double getArea() {
        double area = length * length;
        return area;
    }

}