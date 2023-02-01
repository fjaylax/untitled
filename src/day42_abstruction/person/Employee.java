package day42_abstruction.person;

public abstract class Employee extends Person { //creat abstruct and more versatile

    String jobTitle;
    double salary;

    public Employee(String name, int age, String jobTitle, double salary){
        super(name, age);
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public abstract void work();

    @Override
    public String toString(){
        return super.toString() + " " + jobTitle + " $" + salary;
    }

}
