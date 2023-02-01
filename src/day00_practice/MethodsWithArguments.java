package day00_practice;

public class MethodsWithArguments {
    public static void main(String[] args) {


            printHello("Anait");

            printHello("Jay");

            printHello("Nicolae");

            printHelloNTimes("Kirill", 5);




        }

        public static void printHello (String name) {
            System.out.println("Hello " + name );
        }


        public static void printHelloNTimes(String nameOne, int num) {
            for (int i = 0; i < num; i++) {
                printHello(nameOne);
            }
        }

    }

