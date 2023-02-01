package day43_Polymorphis.buildingHW;

public class OfficeBuilding extends Building implements HasElevator{
    int numberOfFloors;

    public OfficeBuilding(String location, double price, int numberOfFloors) {
        super(location, price);
    }

    @Override
    public void pay() {
        System.out.println("Paying for Office");
    }

    @Override
    public String toString() {
        return "OfficeBuilding{" +
                "numberOfFloors=" + numberOfFloors +
                super.toString()+
                '}';
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Using Elevator");
    }
}
