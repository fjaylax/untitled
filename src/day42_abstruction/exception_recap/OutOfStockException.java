package day42_abstruction.exception_recap;

public class OutOfStockException extends  RuntimeException{

    public OutOfStockException(){ // we creat unchecked exception
        //super();     // constructor if not there doing manualy it is till there

        super("Item out of stock");// this helps us to define the msg of the exception
    }


}
