package day28_methods;

public class VaidVsReturn {

    public static void main(String[] args) {
     sayHello();
     sayBye(); //return value was not used
        String str = sayBye();
        sayBye();
    }
    public static void sayHello(){
        System.out.println("Hello");
    }
    public static String sayBye(){
        return "Bye";

    }
}
