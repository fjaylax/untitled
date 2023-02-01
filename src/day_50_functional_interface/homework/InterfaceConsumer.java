package day_50_functional_interface.homework;

import java.util.function.Consumer;

public class InterfaceConsumer {
    public static void main(String[] args) {
//    Use Consumer functional interface to:
//          1.1    Create a function that prints the first and last element of an array

        Consumer<String[]> printFirstLast = (str) -> {

            System.out.println(str[0] + " " + str[str.length-1]);
        };

        String[] arr = {"one", "two", "three", "four", "five"};
        printFirstLast.accept(arr);

    }
}


