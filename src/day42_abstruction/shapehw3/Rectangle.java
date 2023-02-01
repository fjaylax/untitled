package day42_abstruction.shapehw3;

public class Rectangle extends Shape{
public int length;
public int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length=length;
        this.width=width;
    }

    @Override
    public void area() {
        System.out.println("Area is :" +width*length);
    }

    @Override
    public void perimeter() {
        System.out.println("Perimeter: " +2*(length+width));
    }
}
