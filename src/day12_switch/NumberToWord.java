package day12_switch;

public class NumberToWord {
    public static void main(String[] args) {

        // number from 1-5
                //1>5
                       // 2>5
        int number = 3;
        switch (number){
            case 5:
                System.out.println("five");
                break;
            case 4:
                System.out.println("fout");
                break;
            case 3:
                System.out.println("three");
                break;
            case 2:
                System.out.println("two");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("number shpuld be from between 1 and 5");



        }

    }
}
