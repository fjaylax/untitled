package day13_switch_string;

public class ElevatorRecap {
    public static void main(String[] args) {
         /* we have 4 floors, need to now what is on each floor
     declare and assign a floor number variable. The floor number represent which floor you want the elevator to go to. After getting to each floor show the information of which companies are on that floor. Use the following data:

	floor 1 --> Lobby, StarBucks, Amazon Pick Up
	floor 2 --> NASA, Cydeo, Discover
	floor 3 --> Uber, Lyft, Chase
	floor 4 --> Rooftop, Lounge

	any other floor value --> Invalid Floor Selected
      */
        int floor = 2; // hard coding
        String companies;
        switch (floor) {     // only for comparing values, no double numbers
            case 1:
                companies = "Lobby, StarBucks, Amazon Pick Up";
                break;
            case 2:
                companies = "NASA, Cydeo, Discover";
                break;
            case 3:
                companies = "Uber, Lyft, Chase";
                break;
            case 4:
                companies = "Rooftop, Lounge";
                break;

            default:
                System.out.println("Wrong number");
                companies = "Invalid number input";
                break;
        }
        System.out.printf("floor " +floor+ ":"+companies);
    }
}
