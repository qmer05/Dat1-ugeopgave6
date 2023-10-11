package task4;

public class Circle implements Shape {

    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area = 3.14 * (radius * radius);
        return area;
    }
}
