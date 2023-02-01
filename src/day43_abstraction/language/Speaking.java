package day43_abstraction.language;

public class Speaking {
    public static void main(String[] args) {

        //Language obj = new Language() cannot creat objects of interface

        English obj = new English();
        obj.hello();
        obj.bye();

        Spanish obj1 = new Spanish();
        obj1.hello();



    }
}
