package PracticePractice.polymorphism;



import java.util.ArrayList;
import java.util.List;

public class Homecare {
    public static void main(String[] args) {
        Boy child1 = new Boy("Ivan", 6);
        System.out.println(child1);

        Boy child2 = new Boy("Petr", 7);
        System.out.println(child2);
        child2.run();

        Girl child3 = new Girl("Masha", 8);
        System.out.println(child3);

        Girl child4 = new Girl("Olya", 9);
        System.out.println(child4);

        Child child5 = new Boy("Ilya", 6);
        System.out.println(child5);
        child5.play();
        // no run child5.run();


        //Child child6 = new Child("Noname", 6) ;
        // {// will use ref and methods from Child6
//sout child6.play
        //child5.pay // with cars(ref from boy

        List<Child> group = new ArrayList<>();
        group.add(child1);
        group.add(child2);
        group.add(child3);
        group.add(child4);
        group.add(child5);

        ArrayList<Boy> boysList = new ArrayList<>();
        ArrayList<Girl> girlList = new ArrayList<>();

        for (Child each : group) {
            System.out.println(each.name);
            each.play();

            each.eat();


            if (each instanceof Boy) {

                boysList.add((Boy) each);

            } else {

                    girlList.add((Girl) each);

                }
                System.out.println("______________________");

            }
            System.out.println(boysList);
            System.out.println(girlList);

        }

    }
 /*

    S

With Method:

    create a class BuildingUtil

    create a static method Rent(Building obj)
        return: double
        parameters: Building type

        implementation:
            if the Building is House type return 1500
            if the Building is Apartment type return 800
            if the Building is OfficeBuilding type return 2000

    create a static method search(String location)
        return: Building
        parameters: String location

        implementation
            if the location is Great Falls return a House object with:
                location: Great Falls
                price: 500_000
                number of residents: 4

            if the location is FairFax return a Apartment object with:
                location: FairFax
                price: 250_000
                month for lease: 6

            if the location is McLean return a OfficeBuilding object with:
                location: McLean
                price: 2_000_000
                number of floors: 6

    Run the methods in a main method to test them out
     */






