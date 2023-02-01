package PracticePractice.polymorphism;

public class Boy extends Child implements Run{


    int weight; //add instance var

    @Override
    public void play() {
        System.out.println("Play with cars");

    }
    Boy(String name, int age) {
        this. name=name;
        this.age=age;
        this.weight=30;

    }




    @Override
    public void eat() {
        System.out.println("Boys eat meat");




    }

    @Override
    public void run() {
        System.out.println("boys running a lot");
    }
}
