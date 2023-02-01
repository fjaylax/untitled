package day41_exception.bank;

public class Bank {
    double balance;

    public void withdraw(double amount){

        if(amount > balance){
            throw new NotEnoughMoneyException();
        }

        balance -= amount;
        System.out.println("Money withdrawn");
    }
}
