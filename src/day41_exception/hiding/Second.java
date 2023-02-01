package day41_exception.hiding;

public class Second extends First{
    public static void staticMethod(){
        System.out.println("Static method from Second");
    }

    public void instanceMethodB(){
        staticMethod();
    }



}
