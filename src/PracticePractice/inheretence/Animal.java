package PracticePractice.inheretence;

public class Animal {


    String name;
    String breed;
    private double weight;
    private int paws;

    public Animal(String name, String breed, double weight, int paws) {
        this.name = name;
        this.breed = breed;
        setWeight(weight);
        this.paws = paws;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void eat(){
        System.out.println("I ate the food");
    }
public void drink (){
    System.out.println("I drink water");
}
}
