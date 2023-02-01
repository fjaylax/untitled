package day43_Polymorphis.buildingHW;

public class Apartment extends Building implements HasBalcony{
    int monthOfLease;


    public Apartment(String location, double price, int monthOfLease) {
        super(location, price);
        this.monthOfLease = monthOfLease;
    }

    @Override
    public void pay() {
        System.out.println("Paying for apartment lease");
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "monthOfLease=" + monthOfLease +
                super.toString()+
                '}';
    }

    @Override
    public void openBalcony() {
        System.out.println("Opening the balcony");



    }
}
