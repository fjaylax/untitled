package day40_inheretence.shape;

public class RunShape {

    public static void main(String[] args) {

        Circle circle = new Circle(3.4);
        System.out.println(circle);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());

        System.out.println();
        Square square = new Square(5.5);
        System.out.println(square);

    }
}

