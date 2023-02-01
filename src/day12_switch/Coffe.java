package day12_switch;

public class Coffe {
    public static void main(String[] args) {

        String size = "tall"; // inrput.nextLine()
        double price = 0;
        int calories = 0;

        switch (size) {
            case "tall":
                price = 2.50;
                calories = 150;
                break;

            case "grande":
                price = 4.00;
                calories = 150;

            case "venti":
                price = 4.50;
                calories = 200;

        }
        if (price != 0 && calories != 0) {
            System.out.println("size: " + size + " is " + calories + " calories  and cost $" + price);

            //can add if

        }
    }
}
