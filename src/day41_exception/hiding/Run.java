package day41_exception.hiding;

public class Run {

        public static void main(String[] args) {

            First.staticMethod();
            Second.staticMethod();

            System.out.println();

            new First().instanceMethodA();
            new Second().instanceMethodA();
            new Second().instanceMethodB();


        }

    }

