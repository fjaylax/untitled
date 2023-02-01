package day09_if_statements;

public class Bank {
    public static void main(String[] args) {

        double balance = 1_000_000;
        double amountToWithdraw = 1500_000;
        balance -= amountToWithdraw; // balance = balance - amount toWithdraw
        if (balance >=0){
            System.out.println("Account balance is : "+balance);
        }

        if (balance < 0 ){
            System.out.println("Overdraft penalty");
            System.out.println("Ammount due: "+amountToWithdraw *0.25);

        }
    }
}
