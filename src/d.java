public class d {
    public static void main(String[] args) {

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

    }


