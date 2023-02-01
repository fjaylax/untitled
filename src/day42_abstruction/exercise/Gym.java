package day42_abstruction.exercise;

public class Gym {
    public static void main(String[] args) {
        //        Exercise obj = new Exercise(); not valid because Exercise is abstract - cannot create objects from it

        Running run = new Running();
        run.perform();
        run.getCaloriesBurned(30);
//Lifting obj = Lifting (); cannot do

        Bench benching = new Bench();
        benching.perform();;
        benching.getCaloriesBurned(20);
        benching.rackWeights();
    }
}