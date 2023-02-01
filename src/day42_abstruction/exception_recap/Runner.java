package day42_abstruction.exception_recap;

public class Runner {
    public static void main(String[] args) {
        System.out.println(VendingMachine.select(1));//chips
        //System.out.println(VendingMachine.select(3));//candy

        //System.out.println(VendingMachine.select(2));/*Exception in thread "main" //day42_abstruction.exception_recap.OutOfStockException: Item out of stock
       // at day42_abstruction.exception_recap.VendingMachine.select(VendingMachine.java:19)
        //at day42_abstruction.exception_recap.Runner.main(Runner.java:8)

        // this method has unchecked exception-normally these are not handled
        // select(2) cause exception

        System.out.println("_____________________________________");
       // call and handle checked exception    VVVV

        try {

            System.out.println(VendingMachine.selectValid(5));
        } catch (InvalidSelectionExceptionChecked e) {
            System.out.println(e.getMessage());
          /* print
            _____________________________________
Selection can only be 1, 2, or 3
             */
        }
    }}
