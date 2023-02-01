package day37_static.car;

public class Car {
    String model;
    Driver driver;

public Car(String model, String name,long licenseNumbers, char licenseType) {
    this.model = model;
    new Driver(name, licenseNumbers, licenseType);

}

    public Car(String model, Driver driver){
        this.model = model;
        this.driver = driver;







}


}
