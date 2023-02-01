package day18_loops;

public class AddnumberRerun {
    public static void main(String[] args) {

        int min = 1;
        int max = 9;
        int sum = 0;

        while (min <= max) {

            sum = sum + min;
            System.out.print(sum + " ");
            min++;
        }
    }
}
