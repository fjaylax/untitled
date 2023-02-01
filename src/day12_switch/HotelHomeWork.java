package day12_switch;

import java.util.Scanner;

public class HotelHomeWork {
    public static void main(String[] args) {
        /*
        Ask the user how many days they will stay at the hotel
Then ask the user how many people are in their party (how many people are staying in the room)

Use those two information to determine the price and room type for the hotel based on the below data:

	party size: 1
	room type: single room
	price: number of days * 100

	party size: 2
	room type: double room
	price: number of days * 125

	party size: 3 or 4
	room type: large room
	price: number of days * number of people * 150

	party size: 5, 6, or 7
	room type: suite
	price: number of days * 5000

	any other party size:
		Display one message:
			Sorry we don't have any available rooms for that size party
         */
        int partySize = 0;
        String roomSize = "";
        int days = 0;
        double price = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Party Size:");
        partySize = input.nextInt();
        if (partySize <=7 && partySize>=1) {
        System.out.println("how many days?");
        days = input.nextInt();

            switch (partySize) {
                case 1:
                    roomSize = "Singe Room";
                    System.out.println("Price for a Single room will be $" + days * 100);
                    break;
                case 2:
                    roomSize = "Double Room";
                    System.out.println("Price for a Double room will be $" + days * 125);
                    break;
                case 3:case 4:
                    roomSize = "Large Room";
                    System.out.println("Price for a Large room will be $" + days * 150);
                    break;
                case 5:case 6:case 7:
                    roomSize = "Suit";
                    System.out.println("Price for a Siut will be $" + days * 5000);
                    break;
                default:
                    System.out.println("");
            }
        } else {
            System.out.println("Sorry we don't have any available rooms for that size party");

        }


    }
}
