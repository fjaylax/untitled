package day42_abstruction.exercise;

public class Bench extends Lifting{
    @Override
    public void perform() {
        System.out.println("Bench press");
    }

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(10*minutes);
    }

    @Override
    public void rackWeights() {
        System.out.println("Putting the back back on the rack");
    } //it is concrete class, when underline in red

}
