package Day11_nested;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int validPasscode = 7021;
        System.out.println("welcome to atm . enter your card and enter your passcode\n");

        int usePasscode = input.nextInt();
        if (usePasscode == validPasscode){
            System.out.println("logged in \n select the number \n\t1)Check the balance\n\t2)Withdraw\n\t3)Deposit");
            int selection= input.nextInt();
            if (selection == 1){
            System.out.println("your balance is: 1_000_000");
        }else if (selection == 2){
                System.out.println("How much do u want to withdraw");
                System.out.println("Withdrawing $" +input.nextInt());


            }else if (selection == 3){
                System.out.println("Enter the ammount you want to deposit");
                System.out.println("depositing "+ input.nextInt());
            }

            }else {
            System.out.println("invalid passcode");

        }
    }
}
