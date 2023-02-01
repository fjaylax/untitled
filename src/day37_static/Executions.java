package day37_static;

public class Executions {
    public static void main(String[] args) {
        new Executions();

        System.out.println(1);
    }
    public Executions () {
        System.out.println(2);

    }
    static {
        System.out.println(3);


    }

}
