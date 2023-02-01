package day15_strings;

import java.util.Scanner;

public class AddressHomeWork {
    public static void main(String[] args) {
        /*
        create a class Address
ask the user to enter their address as one input
check which street the house is on and which side of street
handle any extra spaces in the beginning or end of input address
at the end also print the address as all uppercase letters

	houses that have a house number starting with the numbers 500 are on the right side of the street
	while the address that start with the number 600 are on the left side of the street

	the street they are on is given in the address

		print the street by checking for these streets:

			drive: house on drive

			lane: house on lane

			ave: house on avenue

	Ex:

		Input:
			500312 road w drive, 98404

		Output:
			500312 ROAD W DRIVE, 98404
			house on the right side
			house on drive

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you address");
        String address = input.nextLine();
        System.out.println(address.toUpperCase());

        boolean right = address.startsWith("500");
        boolean left = address.startsWith("600");

        if (right) {
            System.out.println("house on right");
        } else if (left) {
            System.out.println("house on left");
        }
            if (address.contains("drive")) {
                System.out.println("house on drive");
            }else if (address.contains("lane")) {
                    System.out.println("hose on lane");
            }else       if (address.contains("ave")) ;
                    System.out.println("house on ave");

                }

            }



