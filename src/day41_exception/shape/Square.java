package day41_exception.shape;

public class Square extends shape {
    public int side;



    public Square(String name) {
        super(name);
    }

    @Override
    public void area() {
        System.out.println(side*side);
    }

    @Override
    public void perimeter(){
        System.out.println(4*side);

    }
}
