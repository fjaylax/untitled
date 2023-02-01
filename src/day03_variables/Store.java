package day03_variables;

public class Store {
    public static void main(String[] args) {

        int numberOfItems = 1000;
        System.out.println(numberOfItems + " in the store");//concatenates the value of the numberOfItems  'in the store'
        numberOfItems = 700;  // resigning 700 into variable
        System.out.println(numberOfItems + " after the sale");

        int totalAfterShipment = numberOfItems = 5000;
        System.out.println("totalAfterShipment = " + totalAfterShipment); //soutv shortcut to print variable

double totalCost = 1_000_000.99;
        System.out.println(totalCost);

        float f = 19.99F; //adding f tell compiler this is a float number, not a double number
        float f2 = 100; // 100 is int tye by fdefaault, and int smaller than float, so there nor problem here
        System.out.println(f);
        System.out.println(f2);

        // int f2 = 100; valid if wanted
        // float f2 = 100F;
        // float f2 = 100.99F;


long population = 8_000_000_000L; // adding L to the number would change number from the int to long type, because 8bil was too long held in int type
        System.out.println(population);

        long pop2 = 1_000_000; //no problem l no needed
    }


}
