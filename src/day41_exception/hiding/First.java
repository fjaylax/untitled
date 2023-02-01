package day41_exception.hiding;

public class First {

    public static void staticMethod(){
        System.out.println("static method from first");

    }
public void instanceMethodA(){
        staticMethod();
}
}
