package day42_abstruction.shapehw3;

public class Circle extends Shape{
public int radius;


    public Circle(int radius) {
        super("Circle");
        this.radius=radius;
    }

    @Override
    public void area() {
        System.out.println("Area : "+(Math.round(Math.PI)));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +

                '}';
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter is : "+2*radius*(Math.round(Math.PI)));



    }
}
