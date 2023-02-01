package day42_abstruction.shape_interface;

public class Square extends Shape{
    private double side;

    public Square(String name, double side) {
        super("Square");
        setSide(side);
    }




    public double getSide() {
        return side;
    }

    public void setSide(double side) {
       if(side <0) {
           throw new RuntimeException("Invalid enter");
       }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public String toString() {
        return "Square{" +
                super.toString()+
                "side=" + side +
                '}';
    }

    @Override
    public double perimeter() {
        return side *4;


    }
}
