package day06_operators;

public class GiftCard {
    public static void main(String[] args) {
      /** create a class GiftCard

       declare and assign a gift card variable at 500
       declare and assign times used at 3
       print using giftcard and subtract 150 from the amount
       reduce the times used by one
       print using giftcard and subtract 99 from the amount
       reduce the time used by one
       print information at the end
       */
            double giftCard =500.00;
            int timeUsed = 3;
            double total1 = giftCard  - 150.00;
        System.out.println("We used our gift card " +timeUsed+ " time today. After spending $150 our balance is $"+total1+".");

        timeUsed = 1;
        double total2 = total1 - 99;
        System.out.println("total2 = " + total2);


        /**What is the value of a and b

         int a = 8;
         int b = a--;

         what is a?
         what is b?
         */

        int a = 10;













    }

}
