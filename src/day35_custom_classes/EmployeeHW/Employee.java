package day35_custom_classes.EmployeeHW;

public class Employee {

    String name;
    int id;
    String jobTitle;
    double salary;


    public Employee(String iName, double iId, String ijobTitle, double isalary) {
        this.name = iName;
        this.id = (int) iId;
        this.jobTitle = ijobTitle;
        this.salary = isalary;


    }








    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }


    }

