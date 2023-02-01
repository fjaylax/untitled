package day12_switch;

public class SwitchExample {
    public static void main(String[] args) {
        int day = 9;
        // number from 1-7 whre 1 mon and 7 sun


        switch (day){
            default:
                System.out.println("not a valid number, has to 1-7");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;




        }
    }
}
