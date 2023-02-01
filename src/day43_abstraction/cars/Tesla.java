package day43_abstraction.cars;

public class Tesla extends ElectricCar { // concret class, has to to implement methods, no abstract
    @Override
    public void start() {
        System.out.println("key car near by, starting car");
    }

    @Override
    public void charge() {
        System.out.println("tesla charging station");
        // Tesla it is ElectricCar
        // is a Car
        //it is Object

    }
}
