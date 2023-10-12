package task4;

public class Main {
    public static void main(String[] args){

        Square square = new Square(25);
        Circle circle = new Circle(15);
        System.out.println("Square area: " + square.getArea());
        System.out.println("Circle area: " + circle.getArea());

        ShapeBuilder builder = new ShapeBuilder();
        builder.addShape(circle);
        builder.addShape(square);

        double totalArea = builder.getTotalArea();
        System.out.println("Total area of shapes: " + totalArea);
    }
}