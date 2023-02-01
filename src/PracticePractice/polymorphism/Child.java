package PracticePractice.polymorphism;

public abstract class Child {
    String name;
    int age;


    public abstract void play();


    public abstract void eat();


    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}





