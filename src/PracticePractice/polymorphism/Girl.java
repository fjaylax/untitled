package PracticePractice.polymorphism;

public class Girl extends Child{
    @Override
    public void play() {
        System.out.println("Play with dolls");
    }

    @Override
    public void eat() {
        System.out.println("Girls eat ice cream");
    }
        public Girl(String name, int age) {

    }
}
