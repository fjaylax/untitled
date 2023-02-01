package day41_exception.employee;

public final class Tester extends Employee {


    public Tester(String name, int age, char gender, int id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void work(){
        System.out.println(getName()+"is testing the aplication");
    }

    @Override
    public void sleep(){
        System.out.println(getName()+"sleep 8 h");

    }
    public void bugReport(){
        System.out.println(getName()+ "creating bug report");
    }

}




