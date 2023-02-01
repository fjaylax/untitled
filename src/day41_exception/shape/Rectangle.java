package day41_exception.shape;

public class Rectangle extends shape{
    public  int width;
    public int length;

    public Rectangle(int width, int length) {

        super("Rectangle");
        this.length=length;
        this.width=width;
    }


    @Override
    public void area() {
        System.out.println(width*length);
    }

    @Override
    public void perimeter() {
        System.out.println(2*(width*length));
    }
}
