package day04_variables;

public class Recap {

    public static void main(String[] args) {

    //declare variables
        double temperature;
        byte numberOfJavaDays;
        short numberOfSoftSkillsDays;

        //assigning value to variable
        temperature = 74.2;
        numberOfJavaDays = 4;
        numberOfSoftSkillsDays = 2;
        System.out.println("temperature = " + temperature +"C");
        System.out.println("numberOfJavaDays = " + numberOfJavaDays);
        System.out.println("numberOfSoftSkillsDays = " + numberOfSoftSkillsDays);


        //declare and assign at the same time
        int numberOfCoffeeCups = 1;
        float rattingOfMovie = 8.9f; // compiler takes 8.9 as double number , we add F to the end to make the float type
        long waterInOcean = 200_000_000_000_000L; // compiler take 2000000000000 as int type, but it too big for int, we need add L to male long type
        System.out.println("Number of coffee cups:"+numberOfCoffeeCups);
        System.out.println("Movie rating:"+rattingOfMovie);
        System.out.println("Water in ocean:"+waterInOcean+  " gal.");



    }

}
