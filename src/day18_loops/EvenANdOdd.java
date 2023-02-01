package day18_loops;

public class EvenANdOdd {
    public static void main(String[] args) {
        int limit = 100;
        int count = 1;
        // printing even number
        while (count <= limit) {
            if (count % 2 == 0) {
                System.out.print(count+" ");

            }
            count++;
        }
        System.out.println();

        //print all ad number back to 1, backwards
        int back = limit;// starting number based on the limit
        while(back>=1){
            if (back%2==1){
                System.out.print(back+ " ");

            }
            back--;
        }

    }
}
