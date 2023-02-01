package day43_Polymorphis.buildingHW;

public abstract class Building {
    String location;
    double price;
    public abstract void pay();

    @Override
    public String toString() {
        return "Building{" +
                "location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    public Building(String location, double price) {
        this.location = location;
        this.price = price;


    }
}
