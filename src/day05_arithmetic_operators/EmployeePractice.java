package day05_arithmetic_operators;

public class EmployeePractice {
    public static void main(String[] args) {
    String firstName = "James";
    String lastName = "Bond";
String companyName = "M16";
char suit = 'E';
String jobTitle = "Secret Agent";
char employeeId = '7';
int numberOfPTO = 15;
double salary = 1_000_000.00;
boolean isFullTime = true;

String fullName = firstName+ " "+ lastName;
String email = firstName+employeeId+ "@"+companyName+".com";
String benefits = "$" +salary + " salary a year, "+numberOfPTO+ " PTO days and WFH";
        String summary = "Employee Information for "+ fullName+ ". "+jobTitle+ " for "
                +companyName+ ", based in suit " +suit+ ". Mr/Mrs " +lastName+" is full time: " +
                ""+isFullTime+". Contact Mr."+lastName + " at " +email+ ".\nCurrent benefits include: " +benefits+" .";
        System.out.println(summary);



    }
}
