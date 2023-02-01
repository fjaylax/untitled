package day17_string;

public class HelloWorldLoop {
    public static void main(String[] args) {
        System.out.println("hello World");

        //infinite loop, does not stop
       // while(true){
           // System.out.println("hello world");


        //print 50 times
        int counter=1; //same as 1 loop counter to <50
        while(counter<=50){
            System.out.println("Hello world "+counter);
            counter++;// this line add 1 to the number each iteration, it allows the loot to stop at some point
        }


    }
}
