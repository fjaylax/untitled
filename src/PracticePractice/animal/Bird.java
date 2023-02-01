package PracticePractice.animal;

public class Bird extends Animal {

    boolean hasWings;

    public Bird(String name, double weight, boolean isFemale) {
        super(name, weight, 2, isFemale);
        this.hasWings = hasWings;
        this.hasWings = true;
    }

    @Override
    public void move() {
        System.out.println("I believe I can fly");
    }


    @Override
    public String toString() {
        return "Bird {" +
                "hasWings=" + hasWings +
                '}';
    }
}