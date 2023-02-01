package day41_exception.shape;

public class ShapeObject {
    public static void main(String[] args) {
        Circle circle = new Circle(45);
        System.out.println(circle);
        circle.area();
        circle.perimeter();

        
    }
}
