package day41_exception.person;

public class Runner {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setAge(21);
        obj.setName("James");

        Person obj2 = new Person();
        obj2.setAge(-30);
        System.out.println(obj2);

    }
}
