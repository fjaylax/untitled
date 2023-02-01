package day35_custom_classes.EmployeeHW;

public class JobOffice {


    public static void main(String[] args) {
     //goToMeeting("James Bond");

    }
    public static void  goToMeeting(String Name){
        //System.out.println(Name+ " is going to meeting");


        Employee jS = new Employee("John Smith", 001, "SDET", 110000);
        Employee jB = new Employee("James Bond", 007, "SDET", 100000);
        Employee eE = new Employee("Elon Elk", 002, "Dev", 125000);

        System.out.println(jS + "\n" + jB + "\n" + eE);






    }
}

