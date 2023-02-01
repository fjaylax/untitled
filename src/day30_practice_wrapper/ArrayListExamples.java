package day30_practice_wrapper;


import java.util.ArrayList;

public class ArrayListExamples {
    public static void main(String[] args) {

        ArrayList<String> cars = new ArrayList<>();

        System.out.println("My collection " + cars);

        cars.add("Crysler Pacific");

        System.out.println("My collection " + cars);
        System.out.println("Number of cars in my collection: " + cars.size());

        cars.add("Volvo");
        cars.add("BMW 340i");

        System.out.println("Number of cars in my collection: " + cars.size());
        System.out.println("My collection " + cars);

        System.out.println("My second car is: " + cars.get(1));

        cars.set(1, "Mersedes");
        System.out.println("My collection " + cars);

        cars.add(2, "Moskvich");
        System.out.println("My collection " + cars);

        cars.remove(1);
        System.out.println("My collection " + cars);

        System.out.println("MY CARS :");
        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }

        for (String each : cars) {
            System.out.println(each);
        }

        System.out.println("My very first car " + cars.get(0));

        cars.clear();
//
//        cars.remove("Moskvich");
//        System.out.println(cars);


//        cars.clear();
//        System.out.println("My cars:" + cars + " size " + cars.size());

    }

}