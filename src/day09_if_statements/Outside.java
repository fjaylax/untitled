package day09_if_statements;

public class Outside {
    public static void main(String[] args) {
        double degrees = 60;

        if (degrees >= 72){
            System.out.println("it's nice go outside");
        }
        if (degrees < 72){
            System.out.println("Stay inside");

            // as is else
            if (degrees >= 72) {
                System.out.println("it's nice go outside");
            }else{
                System.out.println("Stay inside");
            }

        }
    }
}
