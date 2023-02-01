package day08_scanner;

import java.util.Scanner;

public class EmployeeReport{
    public static void main(String[] args) {
        // full name, job title,  salary, company hq, full time
        Scanner input = new Scanner (System.in);
        System.out.println("Print full name:");
        String fullName = input.nextLine();

        System.out.println("Enter your job title:");
        String jobTitle = input.nextLine();


        System.out.println("What is hourly rate?");
        double hourlyRate = input.nextDouble();

        System.out.println("What is the average hours in a week");
        int hours = input.nextInt();

        double salary = hours* 52 * hourlyRate;

        System.out.println("Where is company HQ");
        input.nextLine(); // empty one to catch the enter input
        String hqLocation = input.nextLine();
        System.out.println("are full time?");
        boolean isFullTime = input.nextBoolean();

        String report = fullName + "is a "+ jobTitle + "they make " + salary+ "because thy are full time" + isFullTime;

        System.out.println(report);








    }
}
