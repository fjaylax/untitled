package PracticePractice.CollinsHW2;

public class hm {

    public static void main(String[] args) {

        swapNumbers(3, 6);
        divide_3_5_15();
        consecutiveNumbers(50);

    }


    public static void swapNumbers(int num1, int num2) {

        System.out.println("num1= " + num1 + " / num2= " + num2);

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.println("num1= " + num1 + " / num2= " + num2);
    }


    public static void divide_3_5_15 () {

        String divBy3 = "", divBy5 = "", divBy3_5_15 = "";

        for ( int i = 1; i <= 100; i++ ) {

            if (i % 3 == 0 && i % 5 == 0 && i % 15 == 0 ) {
                divBy3_5_15 += i + " ";
            }  else if (i % 3 == 0 && i % 15 != 0) {
                divBy3 += i + " ";
            } else if (i % 5 == 0 && i % 15 != 0) {
                divBy5 += i + " ";
            }
        }
        System.out.println("DivisibleBy15: " + divBy3_5_15);
        System.out.println("DivisibleBy5 : " + divBy5);
        System.out.println("DivisibleBy3 : " + divBy3);

    }


    public static void  consecutiveNumbers(int forNum) {

        String output = "";
        for (int i = 1; i <= forNum; i ++) {


            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                output += i;
            } else {
                if (i % 2 == 0) {
                    output += "Codility";
                }
                if (i % 3 == 0) {
                    output += "Test";
                }
                if (i % 5 == 0) {
                    output += "Coders";
                }
            }
            output += "\n";
        }
        System.out.println(output);
    }


}

