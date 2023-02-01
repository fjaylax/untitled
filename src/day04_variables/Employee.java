package day04_variables;

public class Employee {
    public static void main(String[] args) {

        String firstName = "Dead";
        String lastName = "Pool";
        String company = "JusticeLeague";
        String jobTitle = "Mercenary";
        String com = "com";
        char suit = 'A';
        char at = '@';
        char dot = '.';
        char suitb = 'B';
        int id = 7927;
        int pto = 14;
        int salary = (int) 125000.00;
        boolean isFullTime = true;

        String fullName = firstName +" " +lastName;
        String eMail = firstName + id + at + company + dot +com;
        String benefits = "Current benefits include: $"+salary+ " a year, " +pto+ " PTO Days "+
                " and work from home.";
        String fullEmployeeReport = "\t\t CONFIDENTIAL:\n"
                +jobTitle +" "+fullName+ " is currently our employee at The Justice League Co. \nWe are currently " +
                "located in suit " +suitb+". Mr. " +fullName+ " is full time: "+isFullTime+ ". \n" +
                "You can reach him at his email at: " +eMail+" . \nHis  "+benefits;
        System.out.println(fullEmployeeReport);









    }

    public void setName() {
    }
}
