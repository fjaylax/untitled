package day43_Polymorphis.buildingHW;

public class House extends Building implements HasElevator, HasBalcony, HasBackyard{

    int numberOfResidents;

    @Override
    public void mowLawn() {
        System.out.println("Mowing grass ");
    }

    @Override
    public void openBalcony() {
        System.out.println("Going to Balcony");
    }

    @Override
    public void elevator(int floor) {
        System.out.println("Using elevator");
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString()+
                "numberOfResidents=" + numberOfResidents +
                                '}';
    }

    public House(String location, double price, int numberOfResidents) {
        super(location, price);
        this.numberOfResidents=numberOfResidents;



    }


    @Override
    public void pay() {

    }
}
