package day42_abstruction.exception_recap;

public class InvalidSelectionExceptionChecked extends Exception{
    //being  a sub class of Exception class makes this a checked exception


    public InvalidSelectionExceptionChecked(){
        super("Selection can only be 1, 2, or 3");

    }
}
