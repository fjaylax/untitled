package day42_abstruction.shape_interface;

public class Cube extends Shape implements Volume {
    private double e;

    public Cube(double e) {
        super("Cube");
        setE(e);

    }

    public double getE() {
        return e;
    }

    public void setE(double e) {
        if (e <= 0) {
            throw new RuntimeException("Invalid edge " + e);
        }
        this.e = e;
    }

    @Override
    public double area() {
        return 6 * e * e;
    }

    @Override
    public double perimeter() {
        return 12 * e;
    }

    @Override
    public double volume() {
        return 0;
    }

      /*  @Override
        public double volume() {
            return e * e * e;
        }

       */
}
