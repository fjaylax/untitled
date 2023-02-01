package day18_loops;

public class DoWhileExample {
    public static void main(String[] args) {
        int i=0;
        do {

            System.out.println(i);
        }while (false);

// the do block is executed first, then the boolean is checked

        do{
            System.out.print(i);
            i++;

        }while (i<=10);

        }
    }

