package day41_exception.bank;

public class NotEnoughMoneyException extends RuntimeException{ // extending RuntimeException class makes this class an unchecked exception

    public NotEnoughMoneyException(){
        super("Not enough money in the account"); // allows me to define the message part of the exception
    }

}