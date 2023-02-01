package day04_variables;

public class CellPhone {
    public static void main(String[] args) {

        String brand = "Apple";
        String model = "IPhone X";
        String color = "Rose Gold";
        double price = 100.99;
        boolean hasCamera = true;
        int size = 128;
        char sim = 'A';
        System.out.println("Phone information \nBand: "+brand);
        System.out.println(model+ "in " +color);
        System.out.println("With " +size+ "gb the price is $");
        System.out.println("sim type: ' "+sim+ " and has a camera: " +hasCamera);
 // alternative solution :

        String report =  "\t Phone information:\nBrand:" +brand+
                "in" +model + "in" +color +
                "\nWith " +size + "gb the price is $"+price+
                "\nsim type: " +sim + " and has a camera: " +hasCamera;
        System.out.println(report);

    }
}
