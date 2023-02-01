package day12_switch;

public class StringObjects {
    public static void main(String[] args) {
        String s = "first"; // String literal , in String pool
        String s2 = new String ("second"); //object in heap
        System.out.println(s == s2); //compare // false
        String s3 = new String("first");
        System.out.println(s == s3); //compare objects in two differ location
        String  s4 = "second";
        System.out.println(s== s4);
        String s5 ="first"; //same as s
        System.out.println(s5);
    }
}
