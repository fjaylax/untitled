package day42_abstruction.exception_recap;

public class VendingMachine {

 /*
 chips   gum  candy
   1     2     3
  */


 public  static String select(int selection){

  String item ="";

  if (selection ==1){
   item ="Chips";
  } else if (selection==2) {
  // item = "Gum"; --> out of stock
throw new OutOfStockException(); //causes exeption, no need to handle. happens in run time(unchecked)

  } else if (selection==3) { //
   item="Candy";


  }


  return item;

 }
    public static String selectValid(int selection) throws  InvalidSelectionExceptionChecked {

        String item = "";

        if(selection == 1){
            item = "Chips";
        } else if(selection == 2){
            item = "Gum";
        } else if(selection == 3){
            item = "Candy";
        } else {
            throw new InvalidSelectionExceptionChecked(); // checked exception - must be handled - but also I created this so I dont want to handle myself
        }
        return item;
    }

}




