package day36_custom_classes.jobOffer;

import java.util.ArrayList;

public class Market {

    public static void main(String[] args) {

        /*
            Create a separate class to create and test the Offer objects

    create multiple Offer objects and store them into an ArrayList of Offers. Create multiple other Lists to filter out different information:

        write a program that can only keep the offers from local area

        write a program that can remove the offers that are not full Time

        write a program that removes all offer that are less than 100,000 salary

        - Find the biggest and lowest salary Offers and print the whole object
         */

        ArrayList<Offer> allOffers = new ArrayList<>();
        allOffers.add(new Offer("Amazon", "San Diego", 120_000, true, 15));
        allOffers.add(new Offer("Chase", "Chicago", 125_000, true, 15));
        allOffers.add(new Offer("Google", "Seattle", 170_000, false, 0));
        allOffers.add(new Offer("Accenture", "Chicago", 110_000, false, 5));
        allOffers.add(new Offer("Walmart", "Chicago", 125_000, false, 0));
        allOffers.add(new Offer("Meta", "Seattle", 135_000, true, 12));
        allOffers.add(new Offer("Deloitte", "Seattle", 135_000, true, 12));

        //write a program that can only keep the offers from local area
        ArrayList<Offer> localOffers = new ArrayList<>(allOffers);
        localOffers.removeIf(offer -> !offer.location.equals("Chicago"));
        System.out.println(localOffers);

//        // alternative, manually
//        for(Offer each : allOffers){
//            if(each.location.equals("Chicago")){
//                System.out.println(each);
//            }
//        }

        //write a program that can remove the offers that are not full Time
        System.out.println();
        ArrayList<Offer> onlyFullTime = new ArrayList<>(allOffers);
        onlyFullTime.removeIf(p -> !p.isFullTime);
        System.out.println(onlyFullTime);
//        onlyFullTime.forEach(each -> System.out.println(each));



    }

}


