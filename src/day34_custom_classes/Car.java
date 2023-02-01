package day34_custom_classes;

public class Car {

    String model;
    int year;
    String color;
    double fuelLevel;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", fuelLevel=" + fuelLevel +
                '}';
    }
}
