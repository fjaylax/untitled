package day07_scanner;
import java.util.Scanner;
public class SalaryHoursPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Enter s salary: ");
        double Salary = input.nextInt();
        System.out.println("Enter your hours :");
        int Hours = input.nextInt();

int HoursWeekly52 = Hours * 52;
        double HourlyRate =  Salary / +HoursWeekly52;


        System.out.println("You hourly rate : " +HourlyRate);



}
}
